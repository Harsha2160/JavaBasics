package com.AbstractClass;

public class ChildClass extends ParentClass {
	public void m3(int a,int b) {
	int c=a+b;	
	System.out.println(c);
	}

	

	@Override
	public int m1(int a) {
		int b=a+10;
		return b;
		
	}

}
