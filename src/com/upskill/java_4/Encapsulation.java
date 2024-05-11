package com.upskill.java_4;

public class Encapsulation {

	
		// Encapsulation used to hide the data using setter and getter method
		private String name= "upskill";  // write and read
		private int ssn = 33333;   // write
		private String username = "Maknun"; //read only
		
		//setter method  - name                            //Set the data, write
		public void setName(String value){
			name = value;
		}
		
		//getter method - name                           //get the data , read
		
		public String getName(){
			return name;
		}
		
		//setter method - ssn          //set the date, write
		
		public void setSSN(int value){
			ssn = value;
		}
		
		//Getter method - username       // get the data, read
		
		public String getUserName(){
			return username;
		}
		
		public static void main(String[]args){
			Encapsulation obj = new Encapsulation();
			obj.setName("Maknun Khan");
			System.out.println(obj.getName());
			
			obj.setSSN(445454545);
			System.out.println(obj.getUserName());
			
			
		}
		
		
		

	

}
