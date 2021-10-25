package com.skilldistillery.jets.entities;

public class Combat extends Jet{

	public Combat(String model, String type, double speed, int range, long cost) {
		super(type, model, speed,range, cost);
	}
	
	public void fight() {
		System.out.println("Fwooooshhhh");
	}
		
}
