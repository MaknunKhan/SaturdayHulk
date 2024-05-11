package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 door");
		
	}

	@Override
	public int iWheel() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 wheel");
		return 4;
	}

	@Override
	public void iSeat() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 seat");
		
	}

	@Override
	public String iColor() {
		// TODO Auto-generated method stub
		System.out.println("My car is red");
		return "red";
	}

	

}
