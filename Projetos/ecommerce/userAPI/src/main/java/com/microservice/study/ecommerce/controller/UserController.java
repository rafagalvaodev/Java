package com.microservice.study.ecommerce.controller;


import com.microservice.study.ecommerce.service.UserService;
import com.microservice.study.shoppingClient.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<PagedModel<UserDTO>> getUsers(Pageable pageable) {
        Page<UserDTO> userDTOList = userService.getAllUsers(pageable);
        return ResponseEntity.ok(new PagedModel<>(userDTOList));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO userDTO = userService.findById(id);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    public ResponseEntity<UserDTO> findByCpf(
            @PathVariable String cpf,
            @RequestParam(name = "userkey", required = true) String userKey) {
        UserDTO userDTO = userService.findByCpf(cpf, userKey);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/user/search")
    public ResponseEntity<List<UserDTO>> queryByName(@RequestParam(name ="name", required = true) String name) {
        List<UserDTO> userDTOPage = userService.queryByName(name);
        return ResponseEntity.ok(userDTOPage);
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> creatUser(@RequestBody UserDTO userDTO) {
        userDTO = userService.saveUser(userDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(userDTO);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
