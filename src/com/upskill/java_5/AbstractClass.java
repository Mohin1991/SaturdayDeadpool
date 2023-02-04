package com.upskill.java_5;

public abstract class AbstractClass {

	//Abstract class has both abstract method and regular method

	//Regular Method
	public void car(){
		System.out.println("My car is Audi ! ");
	}
	
	//Abstract method doesn't have any implementation
	public abstract void iDoor();
	
	//Regular Method
	public int truck(){
		return 5;
	}
	
	//Abstract method doesn't have any implementation
	public abstract int iTruck();
	
	//Regular Method
	public String bus(){
		return "School Bus";
	}
	
	//Abstract method doesn't have any implementation
	public abstract String iBus();
	
}

	

	

