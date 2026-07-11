package com.microservice.study.productAPI.controller;

import com.microservice.study.productAPI.dto.CategoryDTO;
import com.microservice.study.productAPI.repositiry.CategoryRepository;
import com.microservice.study.productAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryDTO>> getAll() {
        List<CategoryDTO> categoryDTOS = categoryService.getAllCategory();
        return ResponseEntity.ok(categoryDTOS);
    }

    @PostMapping("/category")
    public ResponseEntity<CategoryDTO> save(@RequestBody CategoryDTO categoryDTO) {
        categoryDTO = categoryService.saveCategory(categoryDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/id")
                .buildAndExpand(categoryDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(categoryDTO);
    }


}
