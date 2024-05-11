package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";//	Instance OR global variable - Variables declared in Class level, outside method
	
	public static String region = "North America";//	Static variable - variables belong to class and don't required creating object
	
	public static String Area = " Passaic Area New Jersey"; //Static variable - variables belong to class and don't required creating object
	
	
	
	
	
//	Variables in Java
	
//	Instance OR global variable - Variables declared in Class level, outside method
//	Local variable - variables declared in methods 
//	Static variable - variables belong to class and don't required creating object

//	Method parameter - variables used as method parameter
	

	public static void main(String[] args) {
	

		ny("Kings");
		nj("Essex", 50000);
		ct("Fairfield");
		
		mk();
		
		Variables myObj = new Variables();
		System.out.println(myObj.country);
		System.out.println(region);
		
		
	
		
		
		
		
	}
		
		public static void ny(String county){
			String city = "Queens"; //	Local variable - variables declared in methods 
			System.out.println(city);
			System.out.println(county);
		}
		
		
         
		public static void nj(String county, int population){//		Method parameter - variables used as method parameter
			String city = "Bloomfield";
			System.out.println(city);
			System.out.println(population);
			
			
			System.out.println(county);
		}
		

		public  static void ct(String county){
			
			
			System.out.println(county);
		}
		
		public static void mk(){
			String city = "Shahporan";
			System.out.println(Area);
		}

	}


