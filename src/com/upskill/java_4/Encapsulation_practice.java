package com.upskill.java_4;

public class Encapsulation_practice {

	private String name = "Silvi";
	private int dln = 1234;
	private String vehicle = "Audi";
	
	
	
	
	public static void main(String[] args) {
		Encapsulation_practice obj = new Encapsulation_practice();
		obj.Setname("Shammi");
		System.out.println("New name is" + obj.Getname() );
		

	}

	// Setter method - name 
	
	public void Setname(String value){
		name = value;
	}
	
	// Getter Method - name 
	
	public String Getname(){
		return name;
	}
	
	
	
}