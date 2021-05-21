package com.qa.garage.classes;

public class Car extends Vehicle {
	
	// attributes
	private boolean rearViewMirror;
	
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	//constructors
	public Car(int howManyDoors, String manufacturer) {
		super(howManyDoors, manufacturer);
		
	}



	public Car(int howManyDoors, String manufacturer, boolean rearViewMirror) {
		super(howManyDoors, manufacturer);
		this.rearViewMirror = rearViewMirror;
	}

	@Override
	public String toString() {
		return "Car [rearViewMirror=" + rearViewMirror + ", getHowManyDoors()=" + getHowManyDoors()
				+ ", getManufacturer()=" + getManufacturer() + "]";
	}



	
	
	//methods

	
	

}
