package com.produtoapi.cursobasico.service;

import com.produtoapi.cursobasico.entitie.Product;
import com.produtoapi.cursobasico.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }

    public Product update(Long id, Product product){
        if (productRepository.existsById(id)){
            product.setId(id);
            return productRepository.save(product);
        }else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }
}
