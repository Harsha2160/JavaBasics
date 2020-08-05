package com.BasicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
for(int i=10;i<=99;i++)
{
	int j=i%10;
	double d=i/10;
	int k= (int)d;//Type casting
	if(j==k)
		System.out.println(i);
}
	}

}
