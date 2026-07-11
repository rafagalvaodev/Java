package com.ecommerce.shoppingAPI.service;

import com.ecommerce.shoppingAPI.converter.DTOConverter;
import com.ecommerce.shoppingAPI.entity.Shop;
import com.ecommerce.shoppingAPI.repository.ShopRepository;
import com.microservice.study.shoppingClient.dto.ItemDTO;
import com.microservice.study.shoppingClient.dto.ProductDTO;
import com.microservice.study.shoppingClient.dto.ShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    public Page<ShopDTO> getAll(Pageable pageable) {
        Page<Shop> shops = shopRepository.findAll(pageable);
        return shops.map(DTOConverter::convert);
    }

    public List<ShopDTO> getByUser(String userIdentifier) {
        List<Shop> shops = shopRepository.findAllByUserIdentifier(userIdentifier);
        return shops.stream().map(DTOConverter::convert).collect(Collectors.toList());
    }

    public List<ShopDTO> getByDate(ShopDTO shopDTO) {
        List<Shop> shops = shopRepository.findAllByDateGreaterThanEqual(shopDTO.getDate());
        return shops.stream().map(DTOConverter::convert).collect(Collectors.toList());
    }

    public ShopDTO findById(long ProductId) {
        Optional<Shop> shop = shopRepository.findById(ProductId);
        return shop.map(DTOConverter::convert).orElse(null);
    }

    public ShopDTO saveShop(ShopDTO shopDTO, String userKey) {

        if (userService.getUserByCpf(shopDTO.getUserIdentifier(), userKey) == null) {
            return null;
        }

        if (!validadeProducts(shopDTO.getItems())) {
            return null;
        }
        shopDTO.setTotal(shopDTO
                .getItems()
                .stream() // ItemDTO::getPrice
                .map(x -> x.getPrice())
                .reduce((float) 0, Float::sum));

        Shop shop = Shop.convert(shopDTO); //Shop.convert(shopDTO);
        shop.setDate(new Date());

        shop = shopRepository.save(shop);

        return DTOConverter.convert(shop);
    }

    private boolean validadeProducts(List<ItemDTO> itemDTOS) {
        for (ItemDTO itemDTO : itemDTOS) {
            ProductDTO productDTO = productService.getProductByIdentifier(itemDTO.getProductIdentifier());
            if (productDTO == null) {
                return false;
            }
            itemDTO.setPrice(productDTO.getPrice());
        }
        return true;
    }


}
