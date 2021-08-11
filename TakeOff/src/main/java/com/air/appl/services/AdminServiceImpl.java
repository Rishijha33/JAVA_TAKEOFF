package com.air.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.air.appl.beans.Flight;
import com.air.appl.beans.User;
import com.air.appl.dao.AdminDao;
import com.air.appl.dao.AdminDaoImpl;
import com.air.appl.dao.UserDao;

@Service("flightService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao dao;
	public List<Flight> getAllFlights() {
		
		return dao.getAllFlights();
	}
	
	public Flight findById(int flightId) {
		return dao.getFlightById(flightId);
	}
	
	public String deleteFlight(int FlightId) {
		// TODO Auto-generated method stub
		return dao.deleteFlightbyId(FlightId);
	}

	@Override
	public boolean loginAdmin(String email, String password) {
		
		return dao.loginAdmin(email, password);
	}

	@Override
	public Flight addFlight(Flight f) {
		// TODO Auto-generated method stub
		
		return dao.addFlight(f);
	}
}
