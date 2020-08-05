package com.AbstractClass;
//Abstract class can have final, non-final, static and non-static variables.
public abstract class ParentClass {
	int a=10;
	int b=20;
    abstract public int m1(int a);
	public int m2(int b) {
		int c=b+10;
		return c;
	}

}
