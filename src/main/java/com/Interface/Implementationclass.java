package com.Interface;

public class Implementationclass implements Child {

	public int m1(int a)
	{
		int b=a+10;
	    return b;
   
	}
	
	public int m2(int b)
	{
		int c=b+10;
	    return c;
   
	}
	public int m3(int a,int b)
	{
	Implementationclass IC=new 	Implementationclass();
	int c=IC.m1(a)+IC.m2(b);
	return c;
		
	}
}
