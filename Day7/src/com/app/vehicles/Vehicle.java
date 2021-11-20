package com.app.vehicles;

public class Vehicle {
// state(data members)  : registrationNo : String , color : String , price : double
	//registrationNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
	// Override toString to return complete state.
	
	private String Rgno;
	private String color;
	private double price;
	
	public Vehicle(String rno, String color, double price) {
		
		Rgno = rno;
		this.color = color;
		this.price = price;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Vehicle Rgno=" + Rgno + ", color=" + color + ", price=" + price ;
	}


	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle)
		return Rgno.equals(((Vehicle)obj).Rgno);
		return false;
	}
}
