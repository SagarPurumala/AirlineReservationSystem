package com.capgemini.airlinereservationsystem.service;

import java.util.ArrayList;

import com.capgemini.airlinereservationsystem.dao.UserDAO;
import com.capgemini.airlinereservationsystem.dao.UserDAOImple;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.UserInfo;

public class UserServiceImple implements UserService {

	private UserDAO dao=new UserDAOImple();
	@Override
	public boolean registerUser(UserInfo user) {
		// TODO Auto-generated method stub
		return dao.registerUser(user);
	}

	@Override
	public UserInfo authenticateUser(String emailId, String password) {
		// TODO Auto-generated method stub
		return dao.authenticateUser(emailId, password);
	}

	@Override
	public ArrayList<FlightDetails> searchFlightByName(String flightname) {
		// TODO Auto-generated method stub
		return dao.searchFlightByName(flightname);
	}

	@Override
	public ArrayList<FlightDetails> searchFlightBySource(String source) {
		// TODO Auto-generated method stub
		return dao.searchFlightBySource(source);
	}

	@Override
	public ArrayList<FlightDetails> searchFlightByDestination(String destination) {
		// TODO Auto-generated method stub
		return dao.searchFlightByDestination(destination);
	}

	@Override
	public ArrayList<FlightDetails> getFlightDetails() {
		// TODO Auto-generated method stub
		return dao.getFlightDetails();
	}

}
