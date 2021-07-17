package com.carDealership.parent;

import java.util.Random;

public class Buyer extends Cars{

	private String Name;
	private String creditcard;
	private String email;
	private String street;
	private String city;
	private String state;
	private String zip;
	private Cars wanted;
	private String customerNumber;
	
	private String generateCustNum() {
		Random rng = new Random();
		int id1 = rng.nextInt(899)+100;
		int id2 = rng.nextInt(899)+100; 
		String id = id1 + "-" + id2;
		return id;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Cars getWanted() {
		return wanted;
	}
	public void setWanted(Cars wanted) {
		this.wanted = wanted;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber() {
		this.customerNumber = generateCustNum();
	}
	public void copyNumber(String number) {
		this.customerNumber = number;
	}
	
	
	
}
