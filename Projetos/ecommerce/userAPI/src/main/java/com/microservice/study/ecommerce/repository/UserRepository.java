package com.microservice.study.ecommerce.repository;

import com.microservice.study.ecommerce.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpfAndUserKey(String cpf, String userKey);

    List<User> queryByNameLike(String name);

    Page<User> findAll(Pageable pageable);
}
