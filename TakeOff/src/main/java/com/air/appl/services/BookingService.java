package com.air.appl.services;

import java.util.Date;
import java.util.List;

import com.air.appl.beans.Flight;

public interface BookingService {

	public List<Flight> searchFlight(String source, String destination,Date departureDate,String travelClass);
	public String cancelBooking(int bookingId);
}
