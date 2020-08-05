package com.BasicPrograms;

public class Swap_withoutTemp {

	public static void main(String[] args) {
	int x=10;
	int y=20;
	x=x+y;
	y=x-y;
    x=x-y;
    
    System.out.println(x);
    System.out.println(y);
    
    String a="Hello";
    String b="World";
    a=a+b;
    b=a.substring(0, a.length()-b.length());
    a=a.substring(a.length()-b.length(), a.length());
    System.out.println(a);
    System.out.println(b);
	}

}
