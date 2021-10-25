package com.skilldistillery.jets.entities;

public abstract class Jet {
	public String model;
	public String type;
	public double speed;
	public int range;
	public long cost;
	double flightTime;
	
	public Jet ( String model,String make, double speed, int range, long cost) {
		this.model =model;
		this.type= make;
		this.speed= speed;
		this.range = range;
		this.cost=cost;
		this.flightTime= (range/speed);
	}

	public int getRange() {
		return range;
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
	
	
	public void fly() {
		System.out.println("The range of this jet is " + flightTime);
		
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", make=" + type + ", speed=" + speed + ", range=" + range + ", cost=" + cost
				+ ", flightTime=" + flightTime + "]";
	}
	
	
}
