package com.capgemini.airlinereservationsystem.dao;

import java.util.ArrayList;

import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.UserInfo;

public class UserDAOImple implements UserDAO{

	@Override
	public boolean registerUser(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfo authenticateUser(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
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

}
