package com.air.appl.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.Admin;
import com.air.appl.beans.Flight;
import com.air.appl.beans.User;

@Repository("adminDao")
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;
	

	public List<Flight> getAllFlights() {
		String sql= "SELECT f FROM Flight f";
		Query q = em.createQuery(sql);
		List <Flight> flightList = q.getResultList();
		//heo
		return flightList;
		
	}


	@Override
	public Flight getFlightById(int flightId) {
			// TODO Auto-generated method stub
			Flight f = em.find(Flight.class, flightId);
			return f;
		

	}
	@Override
	@Transactional
	public String deleteFlightbyId(int flightId) {
		Flight f = em.find(Flight.class, flightId);
		em.remove(f);
		if(f!=null)
		{
			return "Record Deleted";
		}
		else
		{
			return "not deleted";
		}
		
	}
	
	public Admin loginAdmin(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println(email);
		System.out.println(password);
		String sql = "SELECT a FROM Admin a where a.email= :email AND a.password= :password";
		TypedQuery<Admin> tq = em.createQuery(sql, Admin.class);
		tq.setParameter("email", email);
		tq.setParameter("password", password);
		Admin admin=tq.getSingleResult();
		if(admin!=null)
		{
		return admin;
		}
		else
		{
			return null;
		}
	}

	@Transactional
	@Override
	public Flight addFlight(Flight f) {
		em.persist(f);
		return f;
	}
}
