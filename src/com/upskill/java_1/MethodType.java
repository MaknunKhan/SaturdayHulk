package com.upskill.java_1;

public class MethodType {

	
	public static int hourlyIncome = 65;
	public static void main(String[] args) {
		/* 	Types of Methods
		 
		1.Void Method
		2.Static Method
		3.Return Type Method  
	 */

		MethodType obj = new MethodType();
		obj.annualIncome();
		
		
		obj.weeklyIncome();
		
		
		
		
	
		
		System.out.println(" My Monthly income is  : " + obj.monthlyIncomeReturn());
		System.out.println("Paycheck income is  " +obj.payChcek());
		
		System.out.println(" Employees Name is "  +obj.emoloyeeName());
		
		
		//static void method call directly
		
		weeklyIncomeStatic();
		System.out.println("Working  from home " + workFromHome());
		workFromHome();
		
		
	}
	
	public void annualIncome(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income =  " + calculateAnnualIncome);
	}
	
	
	// void method 
	public void weeklyIncome(){
		int calculateWeekly = hourlyIncome * 40;
		System.out.println("Weekly income in " + calculateWeekly);
	}
	
	
	// return method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 160;
		return calculateMonthlyIncome;
	}
	
	public int payChcek(){
		int payCheck = hourlyIncome * 80;
		return payCheck;
		
	}
	
	public String emoloyeeName(){
		String employee = " Nur Mohammod";
		
		return employee;
	}

	// static void method
	
	public static void weeklyIncomeStatic(){
		int calculateWeekly = hourlyIncome * 40;
		System.out.println(" My Weekly Income = " + calculateWeekly);
	}
	
	public static boolean workFromHome(){
	  boolean remote = true;
	  return remote;
	  
	}
}
