package com.ecommerce.shoppingAPI.service;

import com.microservice.study.shoppingClient.dto.ProductDTO;
import com.microservice.study.shoppingClient.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Value("${PRODUCT_API_URL:http://localhost:8081/product/}")
    private String productApiUrl;

    public ProductDTO getProductByIdentifier(String productIdentifier) {

        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = productApiUrl + productIdentifier;
            ResponseEntity<ProductDTO> response = restTemplate.getForEntity(url, ProductDTO.class);
            return response.getBody();
        } catch (HttpClientErrorException httpClientErrorException) {
            throw new ProductNotFoundException();
        }
    }
}
