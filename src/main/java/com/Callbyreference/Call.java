package com.Callbyreference;

public class Call {
int a=10;
	public static void main(String[] args) {
		Call c=new Call();
		int d=c.sum(c);
    System.out.println("value of d is:" + d);

	}
public int sum(Call c)
{
	int b=10;
	int d=b+c.a;
	return d;
}
}
