package com.practice.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.demo.model.Users;
import com.practice.demo.repository.UsersRepository;


@Component
public class UsersService {
	
	private UsersRepository usersRepository;
	
	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}
	
	
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return usersRepository.save(user);
	}


}
