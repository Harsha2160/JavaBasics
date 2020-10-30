package com.TypeCasting;

public class Casting {

	public static void main(String[] args) {
    int a=10;
    int b=Integer.parseInt("11");
    int sum=Integer.sum(a, b);
    long l=(long)sum;
    double d=(double)l;
    System.out.println(d);
	}

}
