package com.air.appl.controller;

import java.sql.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.air.appl.beans.Booking;
import com.air.appl.beans.Flight;
import com.air.appl.beans.User;
import com.air.appl.beans.sFlight;
import com.air.appl.services.BookingService;
import com.air.appl.services.UserServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1")
public class BookingController {
	
	
	@Autowired
	private BookingService service;
	
	//http://localhost:8090/api/v1/Pune/Mumbai/
//	@GetMapping(path="/{source}/{destination}/{departureDate}/{travelClass}" , produces = "application/json")
//	public List<Flight> getFlightList(@PathVariable(value="source") String source, @PathVariable(value="destination") String destination, @PathVariable(value="departureDate") Date departureDate, @PathVariable(value="travelClass")String travelClass)
//	{
//		return service.searchFlight(source, destination, departureDate, travelClass);
//	}
	
//	
//	@GetMapping(path="/{source}/{destination}/{departureDate}/{travelClass}" , produces = "application/json")
//	public List<Flight> getFlightList(@RequestParam("source") String source, @RequestParam("destination") String destination, @RequestParam("departureDate") Date departureDate, @RequestParam("travelClass")String travelClass)
//	{
//		return service.searchFlight(source, destination, departureDate, travelClass);
//	}
//	


	
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking b)
	{
		return service.addBooking(b);
	}
	
	@PostMapping("/sFlight" )
	public List<Flight> getFlightList(@RequestBody sFlight sf)
	{
		return service.searchFlight(sf);
	}
	
	@PostMapping("/addBookings/{flightId}/{userId}/{travelClass}")
	public long addBookings(@PathVariable int flightId, @PathVariable int userId, @PathVariable String travelClass, @RequestBody Booking b)
	{
		return service.addBookings(b, travelClass, flightId, userId);
	}
	
	
}

