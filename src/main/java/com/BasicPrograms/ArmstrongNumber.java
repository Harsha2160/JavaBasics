package com.BasicPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a[]= new int[5];
for(int i=1;i<10000;i++)
{
	int l=i;
	for(int m=0;m<5;m++)
	{
		
		int j=l%10;
		a[m]=j*j*j;
		double d=l/10;
		l = (int)d; //type casting
	}
	int n=a[0]+a[1]+a[2]+a[3]+a[4];
	if(n==i)
		System.out.println(n);
}

	}

}
