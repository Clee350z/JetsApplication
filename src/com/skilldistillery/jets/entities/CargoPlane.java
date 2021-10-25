package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet{

	//constructor inheriting super make model speed and cost from Jet
	public CargoPlane( String model,String type, double speed, int range, long cost) {
		super(type, model, speed,range, cost);
		
	}
	public void loadCargo() {
		System.out.println("Cargo loaded!");
	}

}
