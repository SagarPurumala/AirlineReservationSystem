package com.capgemini.airlinereservationsystem.dao;

import java.util.ArrayList;

import com.capgemini.airlinereservationsystem.dto.AdminInfo;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.UserInfo;

public class AdminDAOImple implements AdminDAO{

	@Override
	public boolean registerAdmin(AdminInfo admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AdminInfo authenticateAdmin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFlights(FlightDetails flightDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFlight(int flightId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<FlightDetails> searchFlightByName(String flightname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FlightDetails> searchFlightBySource(String source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FlightDetails> searchFlightByDestination(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FlightDetails> getFlightDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookingStatus(UserInfo user, FlightDetails flightDetails) {
		// TODO Auto-generated method stub
		return false;
	}

}
