package com.microservice.study.productAPI.repositiry;

import com.microservice.study.productAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value =
            "SELECT p FROM Product p JOIN Category c on p.category.id = c.id WHERE c.id = :categoryId")
    List<Product> getProductByCategory(@Param("categoryId") long categoryId);

    Product findByProductIdentifier(String productIdentifier);
}
