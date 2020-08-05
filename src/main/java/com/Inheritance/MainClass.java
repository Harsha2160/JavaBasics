package com.Inheritance;

public class MainClass {

	public static void main(String[] args) {
		int b=10;
		Child ch=new Child();
		int d=ch.oct();
		int c=d+b;
System.out.println(c);
Child.print();
Parent.print();

	}

}
