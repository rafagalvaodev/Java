package com.nelio.springbasico.services;

import com.nelio.springbasico.entities.Order;
import com.nelio.springbasico.entities.User;
import com.nelio.springbasico.repositories.OrderRepository;
import com.nelio.springbasico.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    @Transactional
    public Order findById(Long orderId){
        Optional<Order> order = orderRepository.findById(orderId);

        return order.get();
    }
}
