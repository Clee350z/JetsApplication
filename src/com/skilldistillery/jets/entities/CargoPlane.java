package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	
	public CargoPlane(String model, String make, double speed, int range, long cost) {
		super(model, make, speed, range, cost);
	}

	public void loadCargo() {
		System.out.println( model + " has loaded it's cargo! Ready for deployment!");
	}

	//instead of using the Jet's fly(), use this one instead
	@Override
	public void fly() {
		System.out.println("These Cargo types can fly for longer ranges, " +model + " can fly for " + (range/speed) +" miles");
		
	}

}
