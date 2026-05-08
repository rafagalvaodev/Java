package com.project.dscommerce.services;

import com.project.dscommerce.dto.CategoryDTO;
import com.project.dscommerce.dto.ProductDTO;
import com.project.dscommerce.dto.ProductMinDTO;
import com.project.dscommerce.entities.Category;
import com.project.dscommerce.entities.Product;
import com.project.dscommerce.repository.ProductRepository;
import com.project.dscommerce.services.exceptions.DatabaseException;
import com.project.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Recurso não encontrado"));
        return new ProductDTO(product);
    }

//    @Transactional(readOnly = true)
//    public Page<ProductDTO> findAll(Pageable pageable){
//        Page<Product> products = repository.findAll(pageable);
//        return products.map(ProductDTO::new);
//    }

    @Transactional(readOnly = true)
    public Page<ProductMinDTO> findAll(String name, Pageable pageable){
        Page<Product> products = repository.searchByName(name, pageable);
        return products.map(ProductMinDTO::new);
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto){
        Product entity = new Product();
        copyDToToEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductDTO(entity);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto){

        try {
            Product entity = repository.getReferenceById(id);
            copyDToToEntity(dto, entity);
            entity = repository.save(entity);
            return new ProductDTO(entity);
        } catch (EntityNotFoundException e){
            throw  new ResourceNotFoundException("Recurso não encontrado");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void deleteById(Long id){
        if (!repository.existsById(id)){
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException("Falha de integridade referencial");
        }
    }

    private void copyDToToEntity(ProductDTO dto, Product entity){
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setImgUrl(dto.getImgUrl());
        entity.setPrice(dto.getPrice());
        entity.getCategories().clear();
        for (CategoryDTO categoryDTO : dto.getCategories()){
            Category category = new Category();
            category.setId(categoryDTO.getId());
            entity.getCategories().add(category);
        }
    }
}
