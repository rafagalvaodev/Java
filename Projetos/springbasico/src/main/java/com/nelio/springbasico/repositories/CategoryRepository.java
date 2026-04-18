package com.nelio.springbasico.repositories;

import com.nelio.springbasico.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
