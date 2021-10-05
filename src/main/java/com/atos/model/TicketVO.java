package com.atos.model;

import java.time.LocalDate;

public class TicketVO {
	private int ticketId;
	private CustomerVO customerId;
	private String departure;
	private String from;
	private String to;
	private int numberOfPassengers;
	private char insurance;
	private char refundable;
	private LocalDate bookingDate;
	private int totalAmount;
	
	public TicketVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketVO(int ticketId, CustomerVO customerId, String departure, String from, String to, int numberOfPassengers,
			char insurance, char refundable, LocalDate bookingDate, int totalAmount) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.departure = departure;
		this.from = from;
		this.to = to;
		this.numberOfPassengers = numberOfPassengers;
		this.insurance = insurance;
		this.refundable = refundable;
		this.bookingDate = bookingDate;
		this.totalAmount = totalAmount;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public CustomerVO getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerVO customerId) {
		this.customerId = customerId;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public char getInsurance() {
		return insurance;
	}

	public void setInsurance(char insurance) {
		this.insurance = insurance;
	}

	public char getRefundable() {
		return refundable;
	}

	public void setRefundable(char refundable) {
		this.refundable = refundable;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "TicketVO [ticketId=" + ticketId + ", customerId=" + customerId + ", departure=" + departure + ", from="
				+ from + ", to=" + to + ", numberOfPassengers=" + numberOfPassengers + ", insurance=" + insurance
				+ ", refundable=" + refundable + ", bookingDate=" + bookingDate + ", totalAmount=" + totalAmount + "]";
	}
}
