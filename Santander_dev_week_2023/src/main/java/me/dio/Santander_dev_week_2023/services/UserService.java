package me.dio.Santander_dev_week_2023.services;

import me.dio.Santander_dev_week_2023.domain.models.User;

public interface UserService {

	User findById(long id);
	
	User create(User userToCreate);
}
