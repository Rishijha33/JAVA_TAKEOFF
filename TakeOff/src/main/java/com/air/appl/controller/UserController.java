package com.air.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.appl.beans.User;

import com.air.appl.services.UserServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	//http://localhost:8090/api/v1/users
	@GetMapping("/users")
	public List<User> getUserList()
	{
		return service.getAllUsers();
	}
	
	//http://localhost:8090/api/v1/addnewuser
	@PostMapping("/addnewuser")
	public String registerUser(@RequestBody User u)
	{
		service.registerUser(u);
		return "Record added";
	}
}
