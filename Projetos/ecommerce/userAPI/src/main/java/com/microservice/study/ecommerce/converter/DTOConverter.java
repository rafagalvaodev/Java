package com.microservice.study.ecommerce.converter;

import com.microservice.study.ecommerce.entity.User;
import com.microservice.study.shoppingClient.dto.UserDTO;

public class DTOConverter {

    public static UserDTO convert(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setCpf(user.getCpf());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setCellphone(user.getCellphone());
        userDTO.setRegistrationDate(user.getRegistrationDate());
        userDTO.setUserKey(user.getUserKey());
        return userDTO;
    }

}
