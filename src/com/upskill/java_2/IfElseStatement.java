package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		if(age < 13){
			System.out.println("you are childeren");
		}else if(age >= 13 && age <= 18){
			System.out.println("You are teenager");
		}else if(age >= 60){
			
			if (age > 100){
				System.out.println( " you are champion ");
			}else {
				System.out.println("You are senior");
			}
			}
			
		
		else {
			System.out.println("You are adult ");
		}

	}

}