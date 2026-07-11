package com.microservice.study.productAPI.service;

import com.microservice.study.productAPI.dto.CategoryDTO;
import com.microservice.study.productAPI.dto.ProductDTO;
import com.microservice.study.productAPI.entity.Category;
import com.microservice.study.productAPI.entity.Product;
import com.microservice.study.productAPI.repositiry.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Transactional(readOnly = true)
    public List<CategoryDTO> getAllCategory() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryList.stream().map(CategoryDTO::convert).collect(Collectors.toList());
    }

    @Transactional
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        Category category = categoryRepository.save(Category.convert(categoryDTO));
        return CategoryDTO.convert(category);
    }


}
