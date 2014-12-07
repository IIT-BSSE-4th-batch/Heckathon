package com.example.hackproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.impl.conn.SingleClientConnManager;

public class Hospitals{
	
	public List getHospitalList(){
		
		List hospital=new ArrayList<Hospital>();
		hospital.add(new Hospital("Cardio Care, Sonargaon Janapath, Dhaka", "+880-2-8191659", 23.874349, 90.380487));
		hospital.add(new Hospital("Euro-Bangla Heart Hospital Ltd", "+880-2-8159711", 23.753553, 90.367450));
		hospital.add(new Hospital("Ibrahim Cardiac Hospital and Research Institute", "+880-2-9671141", 23.738788, 90.396362));
		hospital.add(new Hospital("Labaid Cardiac Hospital", "+880-2-9676356", 23.741723, 90.36189));
		hospital.add(new Hospital("National Heart Foundation Hospital & Research Institute", "+880-2-8053935", 23.803789, 90.361998));
		hospital.add(new Hospital("National Institute of Cardiovascular Diseases", "+880-2-9111881", 23.770677, 90.369801));
		hospital.add(new Hospital("Rainbow Heart Consultation Center", "+880-2-9115602", 23.770927, 90.367086));
		hospital.add(new Hospital("ZH Sikder Cardiac Care & Research", "+880-2-8115951", 23.740208, 90.359243));
		
		//8 hospitals
		
		return hospital;
	}
	
	public double calculateDistance(double myLat, double myLong, double hosLat, double hosLong){
/*		
		dlon = lon2 - lon1 
		dlat = lat2 - lat1 
		a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2 
		c = 2 * atan2( sqrt(a), sqrt(1-a) ) 
		d = R * c (where R is the radius of the Earth)
*/				
		double disLat = hosLat - myLat;
		double disLong = hosLong - myLong;
		double a = Math.pow(Math.sin(disLat/2), 2) + Math.cos(myLat) * Math.cos(hosLat) * Math.pow(Math.sin(disLong/2), 2);
		double c = Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double radius = 3961; //miles & 6373 km
		double d = radius * c;
		return d;
	}
	
	public void getSortedHospitals(){
		
		List hospitals = getHospitalList();
	}
}
