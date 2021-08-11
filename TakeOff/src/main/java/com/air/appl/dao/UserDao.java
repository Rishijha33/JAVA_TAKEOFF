package com.air.appl.dao;

import java.util.List;

import com.air.appl.beans.User;

public interface UserDao {
	public List<User> getAllUsers();
	public void registerUser(User u);
	public String getUserByEmail(String email, String password);
	public User getUserById(int id);
	public boolean loginUser(String email, String password);
}
