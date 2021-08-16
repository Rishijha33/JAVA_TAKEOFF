package com.air.appl.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.air.appl.beans.Booking;
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
	public List<Flight> searchFlight(String source, String destination, Date departureDate, String travelClass) {
		int e1 , e2, b1,b2;
		List<Flight> myFlightList = new ArrayList<Flight>();
		String sql = "SELECT f FROM Flight f where f.source= :source and f.destination= :destination and f.departureDate=:departureDate";
		TypedQuery<Flight> tq = em.createQuery(sql, Flight.class);
		tq.setParameter("source", source);
		tq.setParameter("destination", destination);
		tq.setParameter("departureDate", departureDate);
//		tq.setParameter("travelClass", travelClass);
		List<Flight> myFlights = tq.getResultList();
		
		if(travelClass=="Economy")
		{
			for(Flight f:myFlights) {
				 e1= f.getEconomicSeats();
				 e2=f.geteSeatsBooked();
				if(e1==e2)
				{
					return null;
				}
				else
				{
					
					myFlightList.add(f);
				}
			}
			return myFlightList;
		}
		else
		{
			for(Flight f:myFlights) {
				 b1= f.getBusinessSeats();
				 b2=f.getbSeatsBooked();
				if(b1==b2)
				{
					return null;
				}
				else
				{
					
					myFlightList.add(f);
				}
			}
			return myFlightList;
		}
		
	}
	

	@Transactional
	@Override
	public Booking addBooking(Booking b) {
		System.out.println("DAO--Booking"+ b);
		em.persist(b);
		return b;
	}


}