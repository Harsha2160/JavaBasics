package com.ExceptionHandlings;

public class Flow {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("hello");
			System.out.println("value of c is"+ c);
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
		finally
		{
		System.out.println("task done");//Always Executed irrespective of Exception happening.
		}
	}

}
