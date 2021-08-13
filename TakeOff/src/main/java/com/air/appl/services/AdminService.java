package com.air.appl.services;

import java.util.List;

import com.air.appl.beans.Admin;
import com.air.appl.beans.Flight;
import com.air.appl.beans.User;

public interface AdminService {

	public List<Flight> getAllFlights();
	public Flight findById(int flightId);
	public String deleteFlight(int flightId);
	public Admin loginAdmin(String email, String password);
	public Flight addFlight(Flight f);
}

