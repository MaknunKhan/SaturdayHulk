package com.upskill.assignment_1;

public class AssigBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num1 = function1();
	        int num2 = function2();
	        
	        int subtractionValue;
	        if (num1 > num2) {
	            subtractionValue = num1 - num2;
	        } else {
	            subtractionValue = num2 - num1;
	        }
	        System.out.println("Subtraction value from bigger number to smaller: " + subtractionValue);
	    }
	    
	    public static int function1() {
	        return 30;
	    }
	    
	    public static int function2() {
	        return 50;
	    }

	}

