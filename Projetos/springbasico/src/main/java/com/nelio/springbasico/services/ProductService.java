package com.nelio.springbasico.services;

import com.nelio.springbasico.entities.Category;
import com.nelio.springbasico.entities.Product;
import com.nelio.springbasico.repositories.CategoryRepository;
import com.nelio.springbasico.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Transactional
    public Product findById(Long productId){
        Optional<Product> product = productRepository.findById(productId);

        return product.get();
    }
}
