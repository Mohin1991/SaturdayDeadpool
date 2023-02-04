package com.upskill.java_4;



public class Polymorphism extends MethodType{

/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	
	public static void main(String[] args) {
		car(6, "Single");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncome();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncome(){
		System.out.println("My Annual Income = 150000");
	}
	
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Audi !");
	}

	public static void car(int hp){
		System.out.println("My car is Hummer ! " + "It has hp engine : " + hp);
	}
	
	public static void car(String roof){
		System.out.println("My car is BMW ! " + "It has roof : " + roof);
	}
	
	public static void car(int battery, String motor){
		System.out.println("My car is TESLA ! " + "It has battery : " + battery + " It has Motor : " + motor);
	}
}




