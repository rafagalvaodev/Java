package me.dio.Santander_dev_week_2023.services.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.Santander_dev_week_2023.domain.models.User;
import me.dio.Santander_dev_week_2023.domain.repository.UserRepository;
import me.dio.Santander_dev_week_2023.services.UserService;

@Service
public class UserImpl implements UserService{

	private final UserRepository userReposity;
	
	
	
	public UserImpl(UserRepository userReposity) {
		this.userReposity = userReposity;
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userReposity.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		// TODO Auto-generated method stub
		if(userReposity.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("O id deste usuario já existe");
		}
		return userReposity.save(userToCreate);
	}

}
