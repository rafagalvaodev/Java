package com.nelio.springbasico.repositories;

import com.nelio.springbasico.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
