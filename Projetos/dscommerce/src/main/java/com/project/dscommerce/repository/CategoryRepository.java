package com.project.dscommerce.repository;

import com.project.dscommerce.dto.CategoryDTO;
import com.project.dscommerce.entities.Category;
import com.project.dscommerce.entities.User;
import com.project.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
