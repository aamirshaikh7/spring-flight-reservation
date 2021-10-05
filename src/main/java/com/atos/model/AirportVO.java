package com.atos.model;

public class AirportVO {
	private int airportId;
	private String airportCode;
	private String airportName;
	
	public AirportVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirportVO(int airportId, String airportCode, String airportName) {
		super();
		this.airportId = airportId;
		this.airportCode = airportCode;
		this.airportName = airportName;
	}

	public int getAirportId() {
		return airportId;
	}

	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	@Override
	public String toString() {
		return "AirportVO [airportId=" + airportId + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ "]";
	}
}
