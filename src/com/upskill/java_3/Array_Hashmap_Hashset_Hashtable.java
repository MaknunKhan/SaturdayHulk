package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array store multiple data using index
		
		int age = 25;
		int[] ageHulk = new int[]{23,23,44,54};  // variable array
		
		// array index  [0] [1] [2] [3]
		
		System.out.println(" Student Age " + ageHulk[3]);
		
		System.out.println("Total Students " + ageHulk.length);
		
		String[] nameHulk = new String[]{"REd", "Nur" , "Maknun", "Saniyad" ,"Fahad"};
		System.out.println("Stident Name :  " + nameHulk[3]);
		System.out.println("Total Student : " + nameHulk.length);
		
		//multi- dimentional Array
		
		int[][] ageHulk2D = {{24,30,44,33}, // [0] [0]  [0] [1]  [0] [2] [0] [3]
				{ 23,44,22} };  // [0] [0]  [0] [1]  [0] [2] 
		
		System.out.println("Student age 2d :  " + ageHulk2D[1][2]);
		
		
		
		// Hashmap store multiple data using key-value pair, implementation of map interface
		
		HashMap<String, Integer>Student = new HashMap <String, Integer>();
		Student.put("Ozil", 32);
		Student.put("Redwan", 25);
		Student.put("Daniya", 43);
	
		Student.put("Zidane", 55);
		Student.put("Nur Maknun", 23);

		System.out.println("Hashmap Student Age : " + Student.get("Ozil"));
		
		HashMap<String, String>Country = new HashMap<String,String>();
		
		Country.put("Bangladesh", "Dhaka");
		Country.put("USA", "Washington Dc");
		Country.put("Inida","Delhi");
		Country.put("Pakistan", "Islamabad");
		
		System.out.println(" Hashmap  Capital of Country :" +Country.get("Bangladesh"));
		
		
		
		
		// HashTable Store multiple data using key-value pair, No Duplicate, also is synchronized (only one thread can modified);
		
		
		Hashtable<String,String>Region = new Hashtable<String,String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		
		
		// HashSet store unordered collection containing unique value, implementation of set interface, no duplicate
		
		
		HashSet<String> car = new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Tesla");
		car.add("Range Rover ");
		
		System.out.println("Car :" + car);
		
		
	};

}
