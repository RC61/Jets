package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	

	public Jet() {
		
	}

public Jet(String model, double speed, int range, long price) {
		this();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

public void fly() {
	System.out.println(this.model + " here.");
	System.out.println("My model can fly for " + (this.range / this.speed) + " hours.");
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

public void setSpeed(double speed) {
	this.speed = speed;
}

public int getRange() {
	return range;
}

public void setRange(int range) {
	this.range = range;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

@Override
public String toString() {
	return "Jet [model=" + model + ", speed=" + speed + " MPH" + ", range=" + range + " miles" +", price=" + price + " Credits" + "]";
}

public void displayJet() {
    String jetData = this.toString();
    System.out.println(jetData);
}
}
