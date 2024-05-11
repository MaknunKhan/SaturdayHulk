package com.upskill.assignment_1;

public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = function1();
		int num2 = function2();
		int substractionValue;
		
		if(num1 > num2 ){
			substractionValue = num1 - num2;
		}else{
			substractionValue = num2 - num1;
			
		}

		System.out.println("subtraction value from bigger number to smaller " + substractionValue);
		
		
	}
	
	public  static int function1(){
		return  30;
	}
	
	public static int function2(){
		return  50;
	}
	

}
