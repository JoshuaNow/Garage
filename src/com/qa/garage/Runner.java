package com.qa.garage;

import com.qa.garage.classes.Car;
import com.qa.garage.classes.Garage;
import com.qa.garage.classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Vehicle> garageList = new ArrayList<Vehicle>();
		Car c = new Car();
		Car z = new Car(4, "honda", true);
//		System.out.println(c.getManufacturer());
//		System.out.println(c);
//		System.out.println(z);
//		
		
		
		Garage g = new Garage();
		  g.addVehicle(c);
	
	}
	
	

}
