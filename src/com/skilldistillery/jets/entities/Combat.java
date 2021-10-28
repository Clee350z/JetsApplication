package com.skilldistillery.jets.entities;

public class Combat extends Jet implements CombatReady{

	public Combat(String type, String model, double speed, int range, long cost) {
		super(type, model, speed,range, cost);
	}
	
	public void EngageCombat() {
		System.out.println("Fwooooshhhh! " + model+ " flying to combat!");
	}

	@Override
	public void fly() {
		System.out.println(model + " can fly for " + (range/speed) + "miles.");
		
	}

	
		
}
