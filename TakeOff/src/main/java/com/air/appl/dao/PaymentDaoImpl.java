package com.air.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.Booking;
import com.air.appl.beans.Payment;

@Repository("paymentDao")
@EnableTransactionManagement
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public Payment payBill(Payment p) {
		long totalCost;
		int bId = p.getBooking().getBookingId();
		String query = "Select b from Booking b where b.bookingId =:bId ";
		TypedQuery<Booking> tq = em.createQuery(query, Booking.class);
		tq.setParameter("bId", bId);
		Booking b = tq.getSingleResult();
		totalCost = b.getTotalCost();
		String bookingStatus = b.getBookingStatus();
		bookingStatus= "confirmed";
		b.setBookingStatus(bookingStatus);
		p.setTotalCost(totalCost);
		System.out.println("feffefefeff" + p);
		
		em.persist(p);
		System.out.println("persisted" + p);
		return p;
	}

}
