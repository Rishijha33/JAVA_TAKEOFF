package com.air.appl.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.air.appl.beans.Flight;
import com.air.appl.dao.BookingDao;

@Service("bookingService")
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingDao dao;
	

	@Override
	public String cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		return dao.cancelBooking(bookingId);
	}


	@Override
	public List<Flight> searchFlight(String source, String destination, Date departureDate, String travelClass) {
		// TODO Auto-generated method stub
		return dao.searchFlight(source, destination, departureDate, travelClass);
	}


	

	


	

}
