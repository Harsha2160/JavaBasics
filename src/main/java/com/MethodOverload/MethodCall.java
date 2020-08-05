package com.MethodOverload;

public class MethodCall {

	public static void main(String[] args) {
		MethodCall mc=new MethodCall();
		mc.A();

	}
	public void A()
	{
		System.out.println("chintu");
		MethodCall mc=new MethodCall();
		String name="Harsha";
		mc.A(name);
	}
	public void A(String name)//Method A has been overloaded. 
	//But Methods with same name and different signatures should be in same class.
	{
		System.out.println(name);
	}

}
