package com.Variable;

public class Non_StaticVariable {
	 int a=10;         //Non-static Global Variable.
	
	public static void main(String[] args) {
	

	}
	public void fun()
	{
		int b=a;
		//a can be used directly because this function is non static.
		System.out.println(b);
	}

}
//If Global Variable is static it can be used directly in static method.
//Similarly If Global Variable is non-static it can be used directly in non-static method.
//If a Static class Variable to be used in a different class then use classname.variable
//If a non-static class Variable to be used in a different class then create Object of the class to use that variable.