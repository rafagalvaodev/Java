package com.project.dscommerce.repository;

import com.project.dscommerce.entities.Order;
import com.project.dscommerce.entities.User;
import com.project.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
