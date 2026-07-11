package com.ecommerce.shoppingAPI.entity;

import com.microservice.study.shoppingClient.dto.ItemDTO;
import jakarta.persistence.*;

@Embeddable
public class Item {

    private Long id;
    private String productIdentifier;
    private float price;

    public Item() {
    }

    public Item(Long id, String productIdentifier, float price) {
        this.id = id;
        this.productIdentifier = productIdentifier;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static Item convert(ItemDTO itemDTO) {
        Item item = new Item();

        item.setId(itemDTO.getId());
        item.setProductIdentifier(itemDTO.getProductIdentifier());
        item.setPrice(itemDTO.getPrice());
        return item;
    }
}
