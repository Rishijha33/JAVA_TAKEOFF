package com.air.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.User;
import com.air.appl.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

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
	@Transactional
	public String getUserByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return dao.getUserByEmail(email,password);
	}

	@Override
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return dao.loginUser(email, password);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

}