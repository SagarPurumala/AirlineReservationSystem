package com.capgemini.airlinereservationsystem.dto;

public class FlightDetails {
	private int flightId;
	private String flightName;
	private String source;
	private String destination;
	private int noofseatsavailable;
	
	public FlightDetails() {
		super();
	}
	public FlightDetails(int flightId, String flightName, String source, String destination, int noofseatsavailable) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.noofseatsavailable = noofseatsavailable;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
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
	public int getNoofseatsavailable() {
		return noofseatsavailable;
	}
	public void setNoofseatsavailable(int noofseatsavailable) {
		this.noofseatsavailable = noofseatsavailable;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", noofseatsavailable=" + noofseatsavailable + "]";
	}


}
