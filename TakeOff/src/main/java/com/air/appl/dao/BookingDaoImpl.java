package com.air.appl.dao;

<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======
import java.util.ArrayList;
>>>>>>> branch 'main' of https://github.com/Rishijha33/JAVA_TAKEOFF.git
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
<<<<<<< HEAD
	public List<Flight> searchFlight(String source, String destination) {
		//Date d = new SimpleDateFormat("dd-MMM-yyyy").parse(date);
		
		String sql = "SELECT f FROM Flight f where f.source= :source and f.destination= :destination ";
=======
	public List<Flight> searchFlight(String source, String destination, Date departureDate, String travelClass) {
		int e1 , e2, b1,b2;
		List<Flight> myFlightList = new ArrayList<Flight>();
		String sql = "SELECT f FROM Flight f where f.source= :source and f.destination= :destination and f.departureDate=:departureDate";
>>>>>>> branch 'main' of https://github.com/Rishijha33/JAVA_TAKEOFF.git
		TypedQuery<Flight> tq = em.createQuery(sql, Flight.class);
		tq.setParameter("source", source);
		tq.setParameter("destination", destination);
<<<<<<< HEAD
		//tq.setParameter("departure", departure);
=======
		tq.setParameter("departureDate", departureDate);
//		tq.setParameter("travelClass", travelClass);
>>>>>>> branch 'main' of https://github.com/Rishijha33/JAVA_TAKEOFF.git
		List<Flight> myFlights = tq.getResultList();
<<<<<<< HEAD
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
=======
		
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
		
>>>>>>> branch 'main' of https://github.com/Rishijha33/JAVA_TAKEOFF.git
	}
	




<<<<<<< HEAD
=======
	
>>>>>>> branch 'main' of https://github.com/Rishijha33/JAVA_TAKEOFF.git

	
}
