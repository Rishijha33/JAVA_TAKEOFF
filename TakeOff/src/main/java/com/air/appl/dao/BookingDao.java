package com.air.appl.dao;

import java.util.Date;
import java.util.List;

import com.air.appl.beans.Flight;

public interface BookingDao {


	public List<Flight> searchFlight(String source, String destination);
	public String cancelBooking(int bookingId);
	
	
}
