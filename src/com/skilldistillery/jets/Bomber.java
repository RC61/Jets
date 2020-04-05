package com.skilldistillery.jets;

public class Bomber extends Jet implements AirToGround{

	public Bomber() {
		super();
	}

	public Bomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		super.fly();
	}

	@Override
	public void dropPayload() {
		
		System.out.println("This is " + this.getModel());
		System.out.println("Opening bay doors");
		System.out.println("Releasing payload\n");
	}

}
