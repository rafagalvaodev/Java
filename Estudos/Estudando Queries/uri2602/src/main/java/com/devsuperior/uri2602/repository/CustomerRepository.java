package com.devsuperior.uri2602.repository;

import com.devsuperior.uri2602.dto.CustomerMinDTO;
import com.devsuperior.uri2602.entities.Customer;
import com.devsuperior.uri2602.projection.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT name FROM customers WHERE UPPER(state) = UPPER(:state) ")
    List<CustomerMinProjection> searchOne(String state);

    @Query(nativeQuery = true, value = "SELECT name, state FROM customers WHERE UPPER(state) = UPPER(:state) ")
    List<CustomerMinProjection> searchTwo(String state);

    @Query("SELECT new com.devsuperior.uri2602.dto.CustomerMinDTO(obj.name) FROM Customer obj WHERE UPPER(obj.state) = UPPER(:state)")
    List<CustomerMinDTO> searchThree(String state);

    @Query("SELECT new com.devsuperior.uri2602.dto.CustomerMinDTO(obj.name, obj.state) FROM Customer obj WHERE UPPER(obj.state) = UPPER(:state)")
    List<CustomerMinDTO> searchFor(String state);
}
