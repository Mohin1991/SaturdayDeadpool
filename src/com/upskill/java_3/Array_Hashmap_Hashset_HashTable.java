package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data using index 
		
		int age = 30;                                                //Variable 
		int [] ageDeadpool = new int [] {25, 21, 35, 30, 40};         // Array

	// Array index                       [0] [1] [2] [3] [4] 
		
		System.out.println ("Student Age : " + ageDeadpool [3]);
		System.out.println (" Total Student : " + ageDeadpool.length);
		System.out.println ("Student Age : " + ageDeadpool [4]);
		System.out.println ("Student Age : " + ageDeadpool [1]);
		
		// String 
		
		
		String [] nameDeadpool = new String [] { "Sumi", "Shamme", "Shimu", "Shima", "Sipa"};
		
		System.out.println ("Student Name : " + nameDeadpool [3]);
		System.out.println ("Total Student Name: " + nameDeadpool.length);
	
		
		// namecity
		
        String [] nameCity = new String [] { "NYC", "Sylhet", "Hudson", "Buffalo"};
        		
		System.out.println ("City Name : " + nameCity [3]);
        System.out.println ("Total City: " + nameCity.length);
    	
   //Multi-Dimentional Arry
        int[][] ageUpskill2D = {{25, 21, 35, 30, 46}, //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
        {21, 25, 22, 26}}; //[1][0] [1][0] [1][2] [1][3] [1][4]
        System.out.println("Student age 2D: " + ageUpskill2D[0][3]);
        System.out.println("Student age 2D: " + ageUpskill2D[0][4]);
       
        
	// Hashmap store multipul data using key-value pair, Implementation of Map interface
	
			HashMap<String, Integer> Student = new HashMap<String, Integer>();
			
			Student.put("Tanzu", 22);
			Student.put("Tahin", 21);
			Student.put("Masud", 24);
			Student.put("Shisir", 24);
			
			System.out.println("HashMap Student Age : "+ Student.get("Tahin"));
			
	

//Hashmap for Capital

HashMap<String, String> Capital= new HashMap<String, String>();
Capital.put("BD", "Dhaka");
Capital.put("USA", "Washington Dc");
System.out.println("Capital City:"+Capital.get("BD"));


HashSet<String> car = new HashSet<String>();
car.add("BMW");
car.add("Toyota");
car.add("Audi");
car.add("Ford");
System.out.println("Car : " + car);
 	
HashSet<String> Capital2 = new HashSet<String>();

	
	Capital2.add("Dhaka");
	Capital2.add("Washington");
	Capital2.add("Istanbul");
	System.out.println("Capital: " + Capital2);
//HasHtable store multiple data using key-value pair, No duplicate, also is synchronized(only one thread can be modified)
	
	Hashtable<String, String> Region = new Hashtable<String,String>();
	 Region.put("BD", "Asia");
	 Region.put("USA", "America");
	 System.out.println("Region :" +Region.get("BD"));
	
	
	
	}}
	









	

