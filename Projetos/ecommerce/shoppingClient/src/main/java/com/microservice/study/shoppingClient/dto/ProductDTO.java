package com.microservice.study.shoppingClient.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDTO {
    private Long id;
    @NotNull
    private String productIdentifier;
    @NotNull
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private Float price;
    @NotNull
    private CategoryDTO category;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String productIdentifier, String name, String description, Float price, CategoryDTO category) {
        this.id = id;
        this.productIdentifier = productIdentifier;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategoryDTO(CategoryDTO category) {
        this.category = category;
    }


}
