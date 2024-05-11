package com.upskill.java_1;

public class MethodType2 {

	
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	
	
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodType2 obj = new MethodType2();
		obj.annualIncomeVoid();
		
		System.out.println("Monthly income = " + obj.monthlyIncomeReturn());
		
		System.out.println("My state name is " +obj.state());
		
		weeklyIncomeStatic();
		

	}
	
	
	//void type method 
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annaul Income = " + calculateAnnualIncome);
	}
	// Return  type method
	public int monthlyIncomeReturn(){
		
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public String state(){
		return "ny";
	}
	
	// Static mathod 
	
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly income  = " + calculateWeeklyIncome);
		
	}

}
