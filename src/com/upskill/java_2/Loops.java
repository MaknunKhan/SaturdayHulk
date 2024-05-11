package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		/*
		  1. for loop
		 2.  while loop
		 3. do while loop
		 4. Infinite loop
		 */

		practiceForLoop();
		practiceWhileLoop();
		 practiceDoWhileLoop();
		// infiniteLoop();
		 
		 practiceNestedForloop();
	}
	
	public static void practiceForLoop(){ 					// for loop  - do again and again upto upper limit.										
		int i;  											// initialize the variable														
		for(i = 1; i <= 10; i++){ 							// setting lower limit,upper limit, Increment or decrement											
			System.out.println("For loops number = " + i);  // Statement							
		}
		
		
		
	}
	
	public static void practiceWhileLoop(){								//while loop - do again and again upto condition match				
		int i=1;														//initialize the variable																																	
		while(i <=10){													//setting condition														
			System.out.println("While loops number = " + i);     		//Statement               
			i++;														//increment or decrement	
		}
	}
	
	public static void practiceDoWhileLoop(){									//do while loop - do action the match condition																		
		int i =1;																// initialize the variable
		do{
			System.out.println("do while loops number = " + i);					//Statement 
			i++;																// Increment or decrement
		}while(i <= 10);														// Checking Condition
	}
	
//	public static void infiniteLoop(){ 													//infinite loop - never ending loop
//	
//		int i;  																		// initialize the variable															
//		for(i = 1;  ; i++){ 																// setting no upper limit													
//			System.out.println("infinite number loops number = " + i);  				//statement	
//		}
//	}
	
	public static void practiceNestedForloop(){ 				//nested loop - loop inside another loop
		int i;													// initialize i for loop 1
		int j;													// Initialize j for loop 2
		for(i=1; i<=10; i++){									// first loop for i								
			for(j=1; j<=10; j++){								// second loop for j
				int multipicatonTable = i * j;					// Statement for loop 2
				System.out.print(multipicatonTable + " ");
			}
			System.out.println(" ");
		}
	}

}
