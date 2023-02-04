package com.upskill.assigment_3;

public class Sumipractise_1 {

	public static void main(String[] args) {
		Sumipractise_1 obj = new Sumipractise_1 ();
		obj.multiply();
		obj.substraction();
		sum ();
		division();
		obj.weeklyplan();
	}
	
	
	
	public void multiply () {        // Void method/ Non static method ex: 1
		int a = 5;
		int b = 12;
		int multiply = (a*b);
		System.out.println (multiply);
	
	}
	
	public void substraction () {       // Ex: 2
		int a = 10;
		int b = 4;
		int substraction = (a-b);
		System.out.println(substraction);
	}
	
	
	//Static method     addition   Ex: 1
	
	public static void sum () {
		int a = 10;
		int b = 13;
		int sum = (a+b);
		System.out.println(sum);
	}
	
	public static void division () {        //Ex: 2
		int a = 20;
		int b = 5;
		int division = (a/b);
		System.out.println(division);
	}
	
	// return type method      
	
	public int weeklyplan () {
		int age = 25;
		return age;  
	}
	
	




	}


