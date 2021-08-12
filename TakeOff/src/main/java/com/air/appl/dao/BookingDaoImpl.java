package com.air.appl.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		//Date d = new SimpleDateFormat("dd-MMM-yyyy").parse(date);
		
		String sql = "SELECT f FROM Flight f where f.source= :source and f.destination= :destination ";
		TypedQuery<Flight> tq = em.createQuery(sql, Flight.class);
		tq.setParameter("source", source);
		tq.setParameter("destination", destination);
		//tq.setParameter("departure", departure);
		List<Flight> myFlights = tq.getResultList();
		for (Flight f : myFlights)
		{
			 String ts = f.getDeparture().toString();
			 try {
				Date d = new SimpleDateFormat("yyyy-MM-dd").parse(ts);
				
				System.out.println(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return myFlights;
	}





	
}
