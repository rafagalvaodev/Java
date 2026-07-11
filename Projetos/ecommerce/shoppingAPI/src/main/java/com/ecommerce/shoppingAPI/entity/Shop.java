package com.ecommerce.shoppingAPI.entity;

import com.microservice.study.shoppingClient.dto.ShopDTO;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userIdentifier;
    private float total;
    private Date date;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "item", joinColumns = @JoinColumn(name = "shop_id"))
    private List<Item> items;

    public Shop() {
    }

    public Shop(long id, String userIdentifier, float total, Date date) {
        this.id = id;
        this.userIdentifier = userIdentifier;
        this.total = total;
        this.date = date;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public static Shop convert(ShopDTO shopDTO) {
        Shop shop = new Shop();

        shop.setId(shopDTO.getId());
        shop.setUserIdentifier(shopDTO.getUserIdentifier());
        shop.setDate(shopDTO.getDate());
        shop.setTotal(shopDTO.getTotal());

        shop.setItems(shopDTO.getItems()
                .stream()
                .map(Item::convert)
                .collect(Collectors.toList()));
        return shop;
    }
}
