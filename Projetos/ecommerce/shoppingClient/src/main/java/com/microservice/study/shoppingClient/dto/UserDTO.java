package com.microservice.study.shoppingClient.dto;

import java.util.Date;

public class UserDTO {
    private Long id;
    private String name;
    private String cpf;
    private String address;
    private String email;
    private String cellphone;
    private Date registrationDate;
    private String userKey;

    public UserDTO() {
    }

    public UserDTO(Long id,
                   String name,
                   String cpf,
                   String address,
                   String email,
                   String cellphone,
                   Date registrationDate,
                   String userKey) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.email = email;
        this.cellphone = cellphone;
        this.registrationDate = registrationDate;
        this.userKey = userKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }


    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }
}
