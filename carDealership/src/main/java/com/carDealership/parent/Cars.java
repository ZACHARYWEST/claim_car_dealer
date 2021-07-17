package com.carDealership.parent;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import javax.annotation.Generated;


public class Cars {
	
	private String stock;
	private String used;
	private int year;
	private String make;
	private String model;
	private double price;
	private double miles;
	private LocalDate dateOnLot;
	private String description;
	private String buyer;
	private String buyersID;
	private LocalDate purchaseDate;
	private String picture;
	private boolean pending;
	private boolean sold;

	
	private String generateStock() {
		Random rng = new Random();
		int id1 = rng.nextInt(899)+100;
		int id2 = rng.nextInt(899)+100;
		int id3 = rng.nextInt(899)+100;
		 
		String id = id1 + "-" + id2 + "-" + id3;
		
		return id;
	}
	
	@Override
	public String toString() {
		return purchaseDate + "\n   buyer=" + buyer + "\n - Vehicle: " + year + " " + make + " " + model + "\n   price = $" + price;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public Cars() {
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public LocalDate getDateOnLot() {
		return dateOnLot;
	}

	public void setDateOnLot(LocalDate dateOnLot) {
		this.dateOnLot = dateOnLot;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getStock() {
		return stock;
	}

	public void setStock() {
		this.stock = generateStock();
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}
	
	public boolean isPending() {
		return pending;
	}
	
	public void setPending(boolean pending) {
		this.pending = pending;
	}
	
	public boolean isSold() {
		return sold;
	}
	
	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public String getBuyersID() {
		return buyersID;
	}

	public void setBuyersID(String buyersID) {
		this.buyersID = buyersID;
	}


}