package com.qa.garage.classes;

import java.util.ArrayList;

import java.util.List;

public class Garage {
	private List<Vehicle> garageList = new ArrayList<>();
	
	public Garage() {
//		this.garageList = garageList; // this is when you have a attribute and a parameter the same.
	}
	
	public void addVehicle(Vehicle anyVehicle) {
		garageList.add((anyVehicle));
		System.out.println(anyVehicle+ " was added to the garage through the addVehicle");
		
		
	}
	
	
	

	
	
	
	
}
