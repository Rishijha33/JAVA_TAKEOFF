package com.air.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.air.appl.beans.User;
import com.air.appl.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;
	@Override
	public List<User> getAllUsers() {
		
		return dao.getAllUsers();
	}
	
}