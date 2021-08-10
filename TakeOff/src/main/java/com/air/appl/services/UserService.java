package com.air.appl.services;

import java.util.List;

import com.air.appl.beans.User;

public interface UserService {
	public List<User> getAllUsers();
	public void registerUser(User u);
	public User getUserByEmail(String email);
	public boolean loginUser(String email, String password);
}
