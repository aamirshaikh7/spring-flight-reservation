package com.atos.model;

import java.time.LocalTime;

public class FlightVO {
	private String flightId;
	private AirlineVO airlineId;
	private int totalSeats;
	private String departure;
	private LocalTime travelTime;
	private String from;
	private String to;
	private int stops;
	
	public FlightVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightVO(String flightId, AirlineVO airlineId, int totalSeats, String departure, LocalTime travelTime, String from,
			String to, int stops) {
		super();
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.totalSeats = totalSeats;
		this.departure = departure;
		this.travelTime = travelTime;
		this.from = from;
		this.to = to;
		this.stops = stops;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public AirlineVO getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(AirlineVO airlineId) {
		this.airlineId = airlineId;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public LocalTime getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(LocalTime travelTime) {
		this.travelTime = travelTime;
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

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	@Override
	public String toString() {
		return "FlightVO [flightId=" + flightId + ", airlineId=" + airlineId + ", totalSeats=" + totalSeats
				+ ", departure=" + departure + ", travelTime=" + travelTime + ", from=" + from + ", to=" + to
				+ ", stops=" + stops + "]";
	}
}
