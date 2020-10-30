package com.Encapsulation;
//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods. 
//Encapsulation is done to achieve Data Hiding.
//It provides you the control over the data. 
//Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. 
//You can write the logic not to store the negative numbers in the setter methods.
//POJO is a data carrier not data hider


public class Encapsulation {
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name;  
	}  

}
