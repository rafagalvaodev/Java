package com.microservice.study.ecommerce.entity;


import com.microservice.study.shoppingClient.dto.UserDTO;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String cpf;
    private String address;
    private String email;
    private String cellphone;
    private Date registrationDate;
    private String userKey;

    public User() {
    }

    public User(long id,
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public static User convert(UserDTO userDTO){
        User user = new User();
       // user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setCpf(userDTO.getCpf());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setCellphone(userDTO.getCellphone());
        user.setUserKey(userDTO.getUserKey());
        user.setRegistrationDate(new Date());
        return user;
    }
}
