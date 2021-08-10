package com.air.appl.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.User;

@Repository("userDao") 	
@EnableTransactionManagement
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<User> getAllUsers() {
		String sql= "SELECT u FROM User u";
		Query q = em.createQuery(sql);
		List <User> userList = q.getResultList();
		return userList;
	}
	
	@Override
	@Transactional
	public void registerUser(User u)
	{
		em.persist(u);
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
