package com.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.Users;
import com.practice.demo.service.UsersService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping(path="/users")
	public ResponseEntity<?> listUsers(){
		
		List<Users> resource = usersService.getUsers();
		return ResponseEntity.ok(resource);
		
	}
	
	
	@PostMapping(path="/user")
	public ResponseEntity<?> saveUser(@RequestBody Users user){
		
		Users resource = usersService.saveUser(user);
		return ResponseEntity.ok(resource);
	}
}
