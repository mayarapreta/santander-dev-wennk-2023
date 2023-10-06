package me.dio.Service.impl;

import java.util.NoSuchElementException;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import me.dio.Service.UseService;

import me.dio.domain.repository.UseRepository;

@Service
public class UserSeriviceImpl implements UseService{

	private final UseRepository userRepository;
	
	public UserSeriviceImpl(UseRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User finById(Long id) {
		return (User) userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	
	}
	@Override
	public  User create(User userToCreate) {
	
		if(userRepository.existsByAccountNumber(userToCreate.getAccount.getNumber())) {
	throw new  IllegalArgumentException("This Account number already exists");
		}

return userRepository.save( userToCreate);
}
}





