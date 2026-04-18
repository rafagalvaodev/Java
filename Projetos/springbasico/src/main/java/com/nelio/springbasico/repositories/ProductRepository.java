package com.nelio.springbasico.repositories;

import com.nelio.springbasico.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
