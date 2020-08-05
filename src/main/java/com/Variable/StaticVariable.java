package com.Variable;

public class StaticVariable {
static int a=10;
	public static void main(String[] args) {
		
int b=10;

int c =b+a;

StaticVariable var=new StaticVariable();
int d=var.test(c);
System.out.println(d);
var.test1(c);
	}
	public int test(int x) {
		int e=10;
		int d=e+x;
		return d;
		
	}
	public void test1(int c) {
		System.out.println("value of y is" +" "+c);
	}

}
