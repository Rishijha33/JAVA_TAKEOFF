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
	@Override
	public void registerUser(User u) {
		dao.registerUser(u);
		
	}
	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}