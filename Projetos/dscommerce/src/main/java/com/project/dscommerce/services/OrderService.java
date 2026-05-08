package com.project.dscommerce.services;

import com.project.dscommerce.dto.OrderDTO;
import com.project.dscommerce.dto.OrderItemDTO;
import com.project.dscommerce.dto.ProductDTO;
import com.project.dscommerce.dto.UserDTO;
import com.project.dscommerce.entities.*;
import com.project.dscommerce.projections.UserDetailsProjection;
import com.project.dscommerce.repository.OrderItemRepository;
import com.project.dscommerce.repository.OrderRepository;
import com.project.dscommerce.repository.ProductRepository;
import com.project.dscommerce.repository.UserRepository;
import com.project.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = orderRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Recurso não encontrado"));
        authService.validadeSelfOrAdmin(order.getClient().getId());
        return new OrderDTO(order);
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto){
        Order order = new Order();
        order.setMoment(Instant.now());
        order.setStatus(OrderStatus.WAITING_PAYMENT);
        User user = userService.authenticated();
        order.setClient(user);

        for (OrderItemDTO itemDTO : dto.getItems()){
            Product product = productRepository.getReferenceById(itemDTO.getProductId());
            OrderItem item = new OrderItem(product, order, itemDTO.getQuantity(), product.getPrice());

            order.getItems().add(item);

        }

        orderRepository.save(order);
        orderItemRepository.saveAll(order.getItems());
        return new OrderDTO(order);
    }

}
