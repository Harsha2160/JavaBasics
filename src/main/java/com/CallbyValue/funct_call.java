package com.CallbyValue;

public class funct_call {

	public static void main(String[] args) {
		int x=10;
		funct_call.f(x);

	}
	public static void f(int a)
	{
		int b=10;
		int c=a+b;
		System.out.println(c);
	}

}
