package com.microservice.study.productAPI.service;

import com.microservice.study.productAPI.converter.DTOConverter;
import com.microservice.study.productAPI.dto.ProductDTO;
import com.microservice.study.productAPI.entity.Product;
import com.microservice.study.productAPI.repositiry.CategoryRepository;
import com.microservice.study.productAPI.repositiry.ProductRepository;
import com.microservice.study.shoppingClient.exception.CategoryNotFoundException;
import com.microservice.study.shoppingClient.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> getAll(Pageable pageable) {
        Page<Product> productList = productRepository.findAll(pageable);
        return productList.map(ProductDTO::convert);
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
        List<Product> productList = productRepository.getProductByCategory(categoryId);
        return productList.stream()
                .map(ProductDTO::convert)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ProductDTO findByProductIdentifier(String productIntifier) {
        Product product = productRepository.findByProductIdentifier(productIntifier);
        if (product != null){
            return DTOConverter.convert(product);
        }
        throw new ProductNotFoundException();
    }

    @Transactional
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Boolean existsCategory = categoryRepository.existsById(productDTO
                .getCategory()
                .getId());

        if (!existsCategory) {
            throw new CategoryNotFoundException();
        }
        Product product = productRepository.save(Product.convert(productDTO));
        return DTOConverter.convert(product);
    }

    public ProductDTO delete(long productId) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(productId);
        product.ifPresent(value -> productRepository.delete(value));
        throw new ProductNotFoundException();
    }

}
