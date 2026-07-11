package com.microservice.study.ecommerce.service;


import com.microservice.study.ecommerce.converter.DTOConverter;
import com.microservice.study.ecommerce.entity.User;
import com.microservice.study.ecommerce.repository.UserRepository;
import com.microservice.study.shoppingClient.dto.UserDTO;
import com.microservice.study.shoppingClient.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> getAllUsers(Pageable pageable) {
        Page<User> usersList = userRepository.findAll(pageable);
        return usersList.map(DTOConverter::convert);
    }

    @Transactional(readOnly = true)
    public UserDTO findById(long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(DTOConverter::convert).orElseThrow(UserNotFoundException::new);
    }

    @Transactional
    public UserDTO saveUser(UserDTO userDTO) {
        userDTO.setUserKey(UUID.randomUUID().toString());
        User user = userRepository.save(User.convert(userDTO));
        return DTOConverter.convert(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public UserDTO deleteUser(long userId) {
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(value -> userRepository.delete(value));
        return null;
    }

    @Transactional(readOnly = true)
    public UserDTO findByCpf(String cpf, String userKey) {
        User user = userRepository.findByCpfAndUserKey(cpf, userKey);
        if (user != null){
            return DTOConverter.convert(user);
        }
        throw new UserNotFoundException();
    }

    @Transactional(readOnly = true)
    public List<UserDTO> queryByName(String name) {
        List<User> userList = userRepository.queryByNameLike(name);
        return userList.stream().map(DTOConverter::convert).collect(Collectors.toList());
    }
}
