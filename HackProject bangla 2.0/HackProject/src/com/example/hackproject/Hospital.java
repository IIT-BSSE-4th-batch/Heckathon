package com.example.hackproject;

public class Hospital {

	public String hospitalName = "";
	public String hospitalPhone = "";
	double hospitalLatitude;
	double hospitalLongitude;
	
	public Hospital(String name, String phone, double latitude, double longitude){
		this.hospitalName = name;
		this.hospitalPhone = phone;
		this.hospitalLatitude = latitude;
		this.hospitalLongitude = longitude;
	}
}
