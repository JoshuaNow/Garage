package com.qa.garage.classes;

public class Vehicle {

	private int howManyDoors;
	private String manufacturer;
	
	
	
	
	public Vehicle() {
		super();
		this.howManyDoors = 4;
		this.manufacturer = "Toyoda";
		// I know that is not how it is spelled I just didn't want a copyright ;P
	}
	
	
	//I can use this to call it in a subclass
	public Vehicle(int howManyDoors, String manufacturer) {
		super();
		this.howManyDoors = howManyDoors;
		this.manufacturer = manufacturer;
	}
	
	
	public int getHowManyDoors() {
		return howManyDoors;
	}
	public void setHowManyDoors(int howManyDoors) {
		this.howManyDoors = howManyDoors;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	@Override
	public String toString() {
		return "Vehicle [howManyDoors=" + howManyDoors + ", manufacturer=" + manufacturer + "]";
	}
	
	
	
	
}
// private is only in its own class
// protected we can access it in any class in the same package , or subclass (subclass doesn't matter what package it is in).