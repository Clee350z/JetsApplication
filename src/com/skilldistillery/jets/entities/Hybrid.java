package com.skilldistillery.jets.entities;

public class Hybrid  extends Jet implements TroopTransport{
	int troopCap;
	public Hybrid(String type, String model, double speed, int range, long cost) {
		super(type, model, speed,range, cost);
		this.troopCap = troopCap;
	}
	//troopCap doesnt do anything right now
	
	public void loadInfantry() {
		System.out.println( getModel() + " has been loaded with grunts! Infantry ready to go!");
	}

	@Override
	public void fly() {
		System.out.println(model + " can fly for " + (range/speed)+ "miles.");
		
	}
	

}
