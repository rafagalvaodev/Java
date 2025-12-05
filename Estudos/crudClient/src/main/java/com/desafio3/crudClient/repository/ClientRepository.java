package com.desafio3.crudClient.repository;

import com.desafio3.crudClient.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
