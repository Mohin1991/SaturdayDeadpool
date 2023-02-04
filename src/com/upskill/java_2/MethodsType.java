package com.upskill.java_2;

public class 36MethodType {
	
/* 	Types of Methods
	 
	1.Void Method/ Non-Static Method 
	2.Static Method
	3.Return Type Method  
 */
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncome();
		
		weeklyIncome();    // 33
		
		// System.out.println("My Monthly Income = " + obj.monthlyIncome());
		obj.monthlyIncome();
		
		shamme();
		obj.shamme2();
		System.out.println(obj.shamme3());
	}
		
	//void Method
	public void annualIncome(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//static Method
	public static void weeklyIncome(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//return type method
	public int monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		System.out.println("My Monthly Income = " + calculateMonthlyIncome);
		return calculateMonthlyIncome;
		
	}
	
	public static void shamme(){				//method
		String name ="Shamme Siddika";			//variable
		int age = 25;
		System.out.println(name);
	}
	
	public void shamme2(){					//method
		String name ="Shamme Siddika";			//variable
		int age = 25;
		System.out.println(name);
	}
	
	public int shamme3(){					//method
		String name ="Shamme Siddika";			//variable
		int age = 25;
		System.out.println(name);
		return age;
	}
	
	// write down a static String return type method?
	
	static String mymethod() {
		String name = "Shamme";
		return name;
		
	}
	
	//write down a static int return type method?
	public static int mymethod2() {
		String name = "Shamme";
		int age = 40
		return age;
		
	
}
	
	
}
