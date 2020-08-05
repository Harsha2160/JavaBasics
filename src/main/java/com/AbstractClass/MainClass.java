package com.AbstractClass;

public class MainClass {

	public static void main(String[] args) {
	ChildClass c=new ChildClass();
	int firstnumber=c.m1(c.a);
	int secondnumber=c.m2(c.b);
	c.m3(firstnumber, secondnumber);

	}

}
