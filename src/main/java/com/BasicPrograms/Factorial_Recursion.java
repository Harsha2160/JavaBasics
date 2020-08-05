package com.BasicPrograms;

public class Factorial_Recursion {
	
	static int num=10;
	static int temp=1;
	public static void main(String[]args) {
		Factorial_Recursion.fact(num);
		System.out.println(temp);
	
	}
	public static int fact(int num)
	{
	if(num!=0)
	{
	temp=num*fact(num-1);
	}
	 return temp;
	
}
}
