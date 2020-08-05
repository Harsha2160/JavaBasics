package com.Constructors;
//We can access Parent Constructor from Child Constructor.
public class Child extends Parent {
	public void m1() 
	{
	System.out.println("Child Method");
	}
public Child()
{
	System.out.println("Child Constructor");
}
}
