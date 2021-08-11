package com.air.appl.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.air.appl.beans.Flight;
import com.air.appl.beans.User;

@Repository("bookingDao") 	
@EnableTransactionManagement
public class BookingDaoImpl implements BookingDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public String cancelBooking(int bookingId) {
		
		
		return null;
	}


	@Override
	public List<Flight> searchFlight(String source, String destination) {
		String sql = "SELECT f FROM Flight f where f.source= :source and f.destination= :destination";
		TypedQuery<Flight> tq = em.createQuery(sql, Flight.class);
		tq.setParameter("source", source);
		tq.setParameter("destination", destination);
		List<Flight> myFlights = tq.getResultList();
		return myFlights;
	}


	
}
