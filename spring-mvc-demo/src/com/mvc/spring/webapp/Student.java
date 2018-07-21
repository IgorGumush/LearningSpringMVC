package com.mvc.spring.webapp;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
//	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		// Hard Coded in java code
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("IL", "Israel");
//		countryOptions.put("TK", "Turkish");
//		countryOptions.put("H", "Heven");
		
		
	}

	
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}



	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
