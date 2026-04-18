package com.nelio.springbasico.services;

import com.nelio.springbasico.entities.Category;
import com.nelio.springbasico.entities.Order;
import com.nelio.springbasico.repositories.CategoryRepository;
import com.nelio.springbasico.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @Transactional
    public Category findById(Long categoryId){
        Optional<Category> category = categoryRepository.findById(categoryId);

        return category.get();
    }
}
