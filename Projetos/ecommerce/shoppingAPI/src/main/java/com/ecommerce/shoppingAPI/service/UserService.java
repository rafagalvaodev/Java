package com.ecommerce.shoppingAPI.service;

import com.microservice.study.shoppingClient.dto.UserDTO;
import com.microservice.study.shoppingClient.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UserService {

    @Value("${USER_API_URL:http://localhost:8080/}")
    private String userApiUrl;

    public UserDTO getUserByCpf(String cpf, String userKey) {
        try {

            RestTemplate restTemplate = new RestTemplate();

            UriComponentsBuilder builder =
                    UriComponentsBuilder.fromUriString(userApiUrl + "/user/cpf/" + cpf);
            builder.queryParam("userkey" , userKey);

            ResponseEntity<UserDTO> response = restTemplate.getForEntity(builder.toUriString(), UserDTO.class);
            return response.getBody();
        } catch (HttpClientErrorException httpClientErrorException) {
            throw new UserNotFoundException();
        }
    }
}
