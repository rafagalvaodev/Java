package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projection.CustomerMinProjection;

public class CustomerMinDTO {
    private String name;
    private String state;

    public CustomerMinDTO(String name) {
        this.name = name;
    }

    public CustomerMinDTO(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public CustomerMinDTO(CustomerMinProjection cmp) {
        name = cmp.getName();
        state = cmp.getState();
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "state: " + this.state;
    }

}
