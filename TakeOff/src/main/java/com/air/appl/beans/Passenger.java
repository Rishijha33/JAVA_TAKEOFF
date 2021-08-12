package com.air.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passengers")
public class Passenger {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "PASSENGER_ID")
	private int passengerId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bookingId")
	private Booking booking;
	
	@Column (name = "NAME")
	private String Name;
	
	@Column (name = "AGE")
	private int passengerAge;
	
	@Column (name = "GENDER")
	private String gender;
	
	@Column (name = "SEAT_NO")
	private int seatNo;

	public Passenger() {
		super();
	}

	public Passenger(int passengerId, Booking booking, String name, int passengerAge, String gender, int seatNo) {
		super();
		this.passengerId = passengerId;
		this.booking = booking;
		Name = name;
		this.passengerAge = passengerAge;
		this.gender = gender;
		this.seatNo = seatNo;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", booking=" + booking + ", Name=" + Name + ", passengerAge="
				+ passengerAge + ", gender=" + gender + ", seatNo=" + seatNo + "]";
	}
	
	
	
	
}
