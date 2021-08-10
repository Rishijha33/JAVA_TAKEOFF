package com.air.appl.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.air.appl.beans.User;

@Repository("userDao") 		
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

}
