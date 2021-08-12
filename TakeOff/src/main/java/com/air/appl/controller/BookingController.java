package com.air.appl.controller;

import java.sql.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.appl.beans.Flight;
import com.air.appl.beans.User;
import com.air.appl.services.BookingService;
import com.air.appl.services.UserServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class BookingController {
	
	
	@Autowired
	private BookingService service;
	
	//http://localhost:8090/api/v1/Pune/Mumbai/
	@GetMapping(path="/{source}/{destination}/{departureDate}/{travelClass}" , produces = "application/json")
	public List<Flight> getFlightList(@PathVariable(value="source") String source, @PathVariable(value="destination") String destination, @PathVariable(value="departureDate") Date departureDate, @PathVariable(value="travelClass")String travelClass)
	{
		return service.searchFlight(source, destination, departureDate, travelClass);
	}

}
