package com.ecommerce.shoppingAPI.converter;


import com.ecommerce.shoppingAPI.entity.Item;
import com.ecommerce.shoppingAPI.entity.Shop;
import com.microservice.study.shoppingClient.dto.ItemDTO;
import com.microservice.study.shoppingClient.dto.ShopDTO;

import java.util.stream.Collectors;

public class DTOConverter {

    public static ItemDTO convert(Item item) {
        ItemDTO itemDTO = new ItemDTO();

      //  itemDTO.setId(item.getId());
        itemDTO.setProductIdentifier(item.getProductIdentifier());
        itemDTO.setPrice(item.getPrice());

        return itemDTO;
    }

    public static ShopDTO convert(Shop shop) {
        ShopDTO shopDTO = new ShopDTO();

        shopDTO.setId(shop.getId());
        shopDTO.setUserIdentifier(shop.getUserIdentifier());
        shopDTO.setDate(shop.getDate());
        shopDTO.setTotal(shop.getTotal());

        if (shop.getItems() != null) {
            shopDTO.setItems(shop.getItems()
                    .stream()
                    .map(DTOConverter::convert)
                    .collect(Collectors.toList()));
        }

        return shopDTO;
    }
}
