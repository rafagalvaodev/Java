package com.microservice.study.shoppingClient.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ItemDTO {

    private Long id;

    @NotBlank
    private String productIdentifier;
    @NotNull
    private float price;

    public ItemDTO() {
    }

    public ItemDTO(Long id, String productIdentifier, float price) {
        this.id = id;
        this.productIdentifier = productIdentifier;
        this.price = price;
    }

    public Long getId() {
        return this.id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
