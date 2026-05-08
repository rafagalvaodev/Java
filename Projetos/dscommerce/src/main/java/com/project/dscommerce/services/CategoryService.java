package com.project.dscommerce.services;

import com.project.dscommerce.dto.CategoryDTO;
import com.project.dscommerce.dto.OrderDTO;
import com.project.dscommerce.dto.OrderItemDTO;
import com.project.dscommerce.dto.ProductMinDTO;
import com.project.dscommerce.entities.*;
import com.project.dscommerce.repository.CategoryRepository;
import com.project.dscommerce.repository.OrderItemRepository;
import com.project.dscommerce.repository.OrderRepository;
import com.project.dscommerce.repository.ProductRepository;
import com.project.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(CategoryDTO::new).toList();
    }


}
