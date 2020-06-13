package com.capgemini.airlinereservationsystem.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.airlinereservationsystem.dto.AdminInfo;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.UserInfo;

public class AirlineRepository {

	public static final List<AdminInfo> ADMIN_INFOS = new ArrayList<AdminInfo>();
	public static final List<UserInfo> USER_INFOS = new ArrayList<UserInfo>();
	public static final List<FlightDetails> FLIGHT_DETAILS = new ArrayList<FlightDetails>();
	
	public static void addToDataBase() {
		ADMIN_INFOS.add(new AdminInfo("admin@gmail.com", "Admin1@"));

		USER_INFOS.add(new UserInfo(101, "sagar", "sagar@gmail.com", "sagar@25", "9642726909"));
		USER_INFOS.add(new UserInfo(102, "aravind", "aravind@gmail.com", "aravind@", "9978342516"));
		USER_INFOS.add(new UserInfo(103, "srikanth", "srikanth@gmail.com", "srikanth@", "9234876641"));

		FLIGHT_DETAILS.add(new FlightDetails(201, "SpiceJet", "Hyderabad", "Bangalore", 13));
		FLIGHT_DETAILS.add(new FlightDetails(202, "IndiGo", "Delhi", "Mumbai", 10));
		FLIGHT_DETAILS.add(new FlightDetails(203, "GoAir", "Chennai", "Hyderabad", 12));
		FLIGHT_DETAILS.add(new FlightDetails(204, "AirAsia India", "Mumbai", "Hyderabad", 8));
		FLIGHT_DETAILS.add(new FlightDetails(205, "TruJet", "Hyderabad", "Delhi", 10));

	}
}
