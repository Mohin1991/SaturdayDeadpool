package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name = "upskill";			//write & read
	private int ssn = 45213678;					//write only
	private String username = "raselalam";		//read only
	private int age = 24;
	private String city = "Jamaica";

	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		System.out.println(obj.getAge());
		obj.setCity("Jamaica");
		System.out.println(obj.getCity());

	}
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}
	// Do setter and getter method with age
	
		//Setter method - age // set the data, write
		public void setAge(int value){
			age = value;
		}
		
		//Getter method -age           // get the data, write
		public int getAge(){
			return age;
		}
	// Setter and getter method - city
		public void setCity(String value){
			city = value;
		}
		
		public String getCity(){
			return city;
		}


	}

