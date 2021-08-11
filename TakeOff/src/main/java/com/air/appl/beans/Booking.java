package com.air.appl.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "BOOKING_ID")
	private int bookingId;
	
	@Column (name = "USER_ID")
	private int userId;
	
	@Column (name = "FLIGHT_ID")
	private int flightId;
	
	@Column (name = "SEAT_TYPE")
	private String seatType;
	
	@Column (name = "BOOKING_DATETIME")
	private Date bookingDT = new Date();
	
	@Column (name = "BOOKING_STATUS")
	private boolean bookingStatus;
	
	@Column (name = "NO_OF_PASSENGERS")
	private int noOfPassengers;
	
	@Column (name = "TOTAL_COST")
	private long totalCost;
	
	@Column (name = "REFUND_AMOUNT")
	private long refundAmount;
	
	@Column (name = "REFUND_AMOUNT1")
	private long refundAmount1;
	
	@Column (name = "REFUND_AMOUNT2")
	private long refundAmount2;
	public Booking() {
		super();
	}

	public Booking(int bookingId, int userId, int flightId, String seatType, Date bookingDT, boolean bookingStatus,
			int noOfPassengers, long totalCost, long refundAmount) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightId = flightId;
		this.seatType = seatType;
		this.bookingDT = bookingDT;
		this.bookingStatus = bookingStatus;
		this.noOfPassengers = noOfPassengers;
		this.totalCost = totalCost;
		this.refundAmount = refundAmount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public Date getBookingDT() {
		return bookingDT;
	}

	public void setBookingDT(Date bookingDT) {
		this.bookingDT = bookingDT;
	}

	public boolean isBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}

	public long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(long refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", seatType="
				+ seatType + ", bookingDT=" + bookingDT + ", bookingStatus=" + bookingStatus + ", noOfPassengers="
				+ noOfPassengers + ", totalCost=" + totalCost + ", refundAmount=" + refundAmount + "]";
	}
	
	
	
}
