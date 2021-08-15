package com.air.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.Booking;
import com.air.appl.beans.Flight;
import com.air.appl.beans.Passenger;

@Repository("passengerDao")
@EnableTransactionManagement
public class PassengerDaoImpl implements PassengerDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public Passenger addPassenger(Passenger p) {
//		int bId = p.getBooking().getBookingId();
//		String query = "Select b from Booking b where b.bookingId =:bId ";
//		TypedQuery<Booking> tq = em.createQuery(query, Booking.class);
//		tq.setParameter("bId", bId);
//		Booking b = tq.getSingleResult();
//		System.out.println("feffefefeff" + p);
//		p.setBooking(b);
		
		System.out.println(p);
		em.persist(p);
		System.out.println("persisted" + p);
		return p;
	}

	
}
