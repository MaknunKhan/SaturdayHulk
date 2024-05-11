package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {
	
	/* 	Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		
		
		//Method Overriding - Runtime Polymorphism - Dynamic binding
		//Same method name from Parent class to override
		
		//Method Overloading - Compile time Polymorphism - Static binding
		//Same method name with different signature
		
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncome();
		
		
		car();
		car("red");
		car("Red",4);
		car("Green",4,7);
		
		

	}
	public void annualIncome(){
		
		int rentalIncome = 24000;
		int cripto = 4000;
		int business = 25000;
		int calculateAnnualIncome = hourlyIncome * 2000 + rentalIncome +cripto + business;
		System.out.println("My Annual Income =  " + calculateAnnualIncome);
		
		
	}
	
	
	public static void car(){
		System.out.println("My car is tesle");
	}
	
	public static void car(String color){
		System.out.println("My car is tesle ,Color is " + color);
	}
	
	public static void car(String color, int door){
		System.out.println("My Car is Tesle , Color is " + color + " is has door " + door);
	}
	
	
	public static void car(String color, int door, int seat){
		System.out.println(" My car is tesla, color is " + color + "is has door "+ door + " it has seat " + seat);
	}

}
