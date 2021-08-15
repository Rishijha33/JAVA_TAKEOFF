package com.air.appl.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
//		String name = u.getFirstName();
		em.persist(u);
	}

	@Override
	@Transactional
	public String getUserByEmail(String email,String password) {
		String sql = "SELECT u FROM User u where u.email= :email";
		TypedQuery<User> tq = em.createQuery(sql, User.class);
		tq.setParameter("email", email);
		User user=tq.getSingleResult();
		if(user!=null)
		{
			user.setPassword(password);
			em.merge(user);
			return "Password updated";
		}
		else
		{
			return "Something went wrong";
		}
	}

	@Override
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println(email);
		System.out.println(password);
		String sql = "SELECT u FROM User u where u.email= :email AND u.password= :password";
		TypedQuery<User> tq = em.createQuery(sql, User.class);
		tq.setParameter("email", email);
		tq.setParameter("password", password);
		User u=tq.getSingleResult();
		/*
		 * System.out.println(u.getEmail()); System.out.println(u.getPassword());
		 */
		if(u!=null)
		{
		return u;
		}
		else
		{
			return null;
		}
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User u = em.find(User.class, id);
		return u;
	}

}