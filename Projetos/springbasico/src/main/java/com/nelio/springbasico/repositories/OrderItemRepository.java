package com.nelio.springbasico.repositories;

import com.nelio.springbasico.entities.Order;
import com.nelio.springbasico.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
