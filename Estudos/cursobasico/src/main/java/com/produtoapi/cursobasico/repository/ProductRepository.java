package com.produtoapi.cursobasico.repository;

import com.produtoapi.cursobasico.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
