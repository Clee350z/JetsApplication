package com.skilldistillery.jets.entities;

public abstract class Jet {
	protected String model;
	protected String type;
	protected double speed;
	protected int range;
	protected long cost;
	protected double flightTime;
	//Your field data in your Jet class are exposed,
	//remember to encapsulate your data.
	//switch public variables to protected
	
	public Jet ( String model,String make, double speed, int range, long cost) {
		this.model =model;
		this.type= make;
		this.speed= speed;
		this.range = range;
		this.cost=cost;
		this.flightTime= (range/speed);
	}

	public abstract void fly() ;
	//BE SURE TO ASK ANTHONY WHY THIS NEEDS TO BE ABSTRACT
	
	
	public int getRange() {
		return range;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", type=" + type + ", speed=" + speed + ", range=" + range + ", cost=" + cost
				+ "]";
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getMake() {
		return type;
	}

	public void setMake(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//public double getSpeedInMach() {
		//COME BACK TO THIS, DONT FORGET
	//}
	
	

	
	
}
