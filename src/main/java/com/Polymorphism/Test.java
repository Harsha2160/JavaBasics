package com.Polymorphism;

public class Test {

	public static void main(String[] args) {
Car c=new Car();

c.start();
c.stop();
c.refuel();
		BMW b=new BMW();//compile time or static polymorphism
		b.start();
		b.stop();
		b.refuel();
		b.performance();
		Car c1=new BMW();//dynamic or Runtime Polymorphism
		c1.start();
		//Cannot access exclusive methods of child. like performance().
		
		
	}

}
