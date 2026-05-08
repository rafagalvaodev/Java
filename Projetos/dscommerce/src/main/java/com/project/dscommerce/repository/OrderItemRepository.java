package com.project.dscommerce.repository;

import com.project.dscommerce.entities.Order;
import com.project.dscommerce.entities.OrderItem;
import com.project.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
