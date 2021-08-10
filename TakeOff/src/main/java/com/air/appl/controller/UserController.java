package com.air.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = "/users/{email}/{password}" , produces = "application/json")
	public boolean loginUser(@PathVariable(value="email")String email, @PathVariable(value="password")String password)
	{
		return service.loginUser(email,password);
	}
	
	@GetMapping(path = "/users/{id}" , produces = "application/json")
	public User getUserById(@PathVariable(value="id")int userid)
	{
		return service.getUserById(userid);
	}
	
	@PutMapping(path = "/updateuser")
	public String updatePassword(@RequestBody User user)
	{
		String email=user.getEmail();
		String password=user.getPassword();
		return service.getUserByEmail(email,password);
	}
}
