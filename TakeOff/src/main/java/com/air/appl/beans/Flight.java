package com.air.appl.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "FLIGHT_ID")
	private int flightId;
	
	@Column (name = "ADMIN_ID")
	private int adminId;
	
	@Column (name = "FLIGHT_NAME")
	private String flightName;
	
	@Column (name = "SOURCE")
	private String source;
	
	@Column (name = "DESTINATION")
	private String destination;
	
	@Column (name = "DEPARTURE")
	private Date departure = new Date();
	
	@Column (name = "ARRIVAL")
	private Date arrival = new Date();
	
	
	@Column (name = "ECONOMIC_SEATS")
	private int economicSeats;
	
	
	@Column (name = "BUSINESS_SEATS")
	private int businessSeats;
	
	@Column (name = "ECONOMY_COST")
	private long economyCost;
	
	@Column (name = "BUSINESS_COST")
	private long businessCost;
	
	@Column (name = "E_SEATS_BOOKED")
	private int eSeatsBooked;
	
	@Column (name = "B_SEATS_BOOKED")
	private int bSeatsBooked;

	public Flight() {
		super();
	}

	public Flight(int flightId, int adminId, String flightName, String source, String destination, Date departure,
			Date arrival, int economicSeats, int businessSeats, long economyCost, long businessCost, int eSeatsBooked,
			int bSeatsBooked) {
		super();
		this.flightId = flightId;
		this.adminId = adminId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.economicSeats = economicSeats;
		this.businessSeats = businessSeats;
		this.economyCost = economyCost;
		this.businessCost = businessCost;
		this.eSeatsBooked = eSeatsBooked;
		this.bSeatsBooked = bSeatsBooked;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public int getEconomicSeats() {
		return economicSeats;
	}

	public void setEconomicSeats(int economicSeats) {
		this.economicSeats = economicSeats;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public long getEconomyCost() {
		return economyCost;
	}

	public void setEconomyCost(long economyCost) {
		this.economyCost = economyCost;
	}

	public long getBusinessCost() {
		return businessCost;
	}

	public void setBusinessCost(long businessCost) {
		this.businessCost = businessCost;
	}

	public int geteSeatsBooked() {
		return eSeatsBooked;
	}

	public void seteSeatsBooked(int eSeatsBooked) {
		this.eSeatsBooked = eSeatsBooked;
	}

	public int getbSeatsBooked() {
		return bSeatsBooked;
	}

	public void setbSeatsBooked(int bSeatsBooked) {
		this.bSeatsBooked = bSeatsBooked;
	}
	
	
	
	
	
	
}
