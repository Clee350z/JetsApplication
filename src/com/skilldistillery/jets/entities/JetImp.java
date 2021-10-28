package com.skilldistillery.jets.entities;

public class JetImp extends Jet{

	public JetImp(String model, String make, double speed, int range, long cost) {
		super(model, make, speed, range, cost);
		
	}
	public void fly() {
		System.out.println("The range of this jet is " + flightTime);
		
	}
	

}
