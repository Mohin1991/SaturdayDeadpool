package com.upskill.java_1;

public class Variables {
	
	//Variables in Java
	String country = "USA";						//Instance OR global variable - Variables declared in Class level, outside method
	
	static String name = "Shammes";				//Static variable - variables belong to class and don't required creating object

	public static void main(String[] args) {
		String city = "New York";				//Local variable - variables declared in methods 
		
		System.out.println(name);
		
		Variables obj = new Variables();		//Creating Object
		System.out.println(obj.country);
		
		method2("Queens");
	}
	
	public static void method2(String county){			//Method parameter - variables used as method parameter, pass value
		String city = "Bloomfield";	
		System.out.println(county);
	}
	//Test Git
}

