package com.microservice.study.productAPI.converter;

import com.microservice.study.productAPI.dto.CategoryDTO;
import com.microservice.study.productAPI.dto.ProductDTO;
import com.microservice.study.productAPI.entity.Category;
import com.microservice.study.productAPI.entity.Product;

public class DTOConverter {

    public static CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }

    public static ProductDTO convert(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setProductIdentifier(product.getProductIdentifier());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        if (product.getCategory() != null){
            productDTO.setCategoryDTO(CategoryDTO.convert(product.getCategory()));
        }

        return productDTO;
    }
}
