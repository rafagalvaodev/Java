package com.microservice.study.shoppingClient.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ShopDTO {

    private Long id;
    @NotBlank
    private String userIdentifier;
    //@NotNull
    private Float total;
   // @NotNull
    private Date date;
    @NotNull
    private List<ItemDTO> items;

    public ShopDTO() {
    }

    public ShopDTO(Long id, String userIdentifier, Float total, Date date, List<ItemDTO> items) {
        this.id = id;
        this.userIdentifier = userIdentifier;
        this.total = total;
        this.date = date;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

}
