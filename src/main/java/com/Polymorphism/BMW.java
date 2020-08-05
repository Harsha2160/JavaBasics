package com.Polymorphism;

public class BMW extends Car {
	public void start()//Overridden method. Preference is given to Overridden/Child method.
	{
		System.out.println("BMW-Start");
	}
	public void performance()
	{
		System.out.println("BMW-Performance");
	}

}
