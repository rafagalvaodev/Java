package com.microservice.study.productAPI.controller;

import com.microservice.study.productAPI.dto.ProductDTO;
import com.microservice.study.productAPI.entity.Product;
import com.microservice.study.productAPI.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<PagedModel<ProductDTO>> getProducts(Pageable pageable) {
        Page<ProductDTO> productDTOPage = productService.getAll(pageable);
        return ResponseEntity.ok(new PagedModel<>(productDTOPage));
    }

    @GetMapping("/product/category/{categoryId}")
    public ResponseEntity<List<ProductDTO>> getProductByCategory(@PathVariable Long categoryId) {
        List<ProductDTO> productDTOList = productService.getProductByCategoryId(categoryId);
        return ResponseEntity.ok(productDTOList);
    }

    @GetMapping("/product/{productIdentifier}")
    public ResponseEntity<ProductDTO> findById(@PathVariable String productIdentifier) {
        ProductDTO productDTO = productService.findByProductIdentifier(productIdentifier);
        return ResponseEntity.ok(productDTO);
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        productDTO = productService.saveProduct(productDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(productDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(productDTO);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<ProductDTO> deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
