package com.atos.model;

public class AirlineVO {
	private int airlineId;
	private String airlineName;
	
	public AirlineVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AirlineVO(int airlineId, String airlineName) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	@Override
	public String toString() {
		return "AirlineVO [airlineId=" + airlineId + ", airlineName=" + airlineName + "]";
	}
}
