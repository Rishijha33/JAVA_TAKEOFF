package com.air.appl.dao;

import java.util.List;

import com.air.appl.beans.Flight;


public interface AdminDao {

	
	public List<Flight> getAllFlights();
	public Flight getFlightById(int flightId);
	public String deleteFlightbyId(int flightId);
	public boolean loginAdmin(String email, String password);
	public Flight addFlight(Flight f);
}
