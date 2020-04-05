package com.skilldistillery.jets;

public class Fighter extends Jet implements AirToAir{

	public Fighter() {
		super();
	}

	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		super.fly();
	}

	@Override
	public void dogFight() {

		System.out.println("This is " + this.getModel());
		System.out.println("PEW\tPEW");
		System.out.println("\tPEW PEW");
		
	}
	

}