package me.dio.Santander_dev_week_2023.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.Santander_dev_week_2023.domain.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByAccountNumber(String accountNumber);
	
	
}
