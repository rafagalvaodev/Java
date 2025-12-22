package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.CategoryDTO;
import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;
import com.devsuperior.aula.repositories.CategoryRepository;
import com.devsuperior.aula.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    /*
    *
    * Aqui pegamos apenas o id da categoria, o nome fica null
    *
    *
    * */

//    public ProductDTO insert(ProductDTO dto){
//        Product entity = new Product();
//
//        entity.setName(dto.getName());
//        entity.setPrice(dto.getPrice());
//
//        for (CategoryDTO categoryDTO : dto.getCategories()){
//            Category category = new Category();
//            category.setId(categoryDTO.getId());
//            entity.getCategories().add(category);
//        }
//
//        entity = repository.save(entity);
//        return new ProductDTO(entity);
//    }


    /*
    *
    * Aqui pegamos o nome e o id das categorias, categoria aninhada
    *
    * */
    public ProductDTO insert(ProductDTO dto){
        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDTO categoryDTO : dto.getCategories()){
           // Category category = new Category();
           // category.setId(categoryDTO.getId());
            Category category = categoryRepository.getReferenceById(categoryDTO.getId());
            entity.getCategories().add(category);
        }

        entity = repository.save(entity);
        return new ProductDTO(entity);
    }
}
