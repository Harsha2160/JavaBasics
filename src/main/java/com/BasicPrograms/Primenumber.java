package com.BasicPrograms;

public class Primenumber {
	

public static void main(String[] args) {
	
	System.out.println("2");
	for(int i=3;i<=100;i++)
	for(int j=2;j<i;j++)
	{   
		if(i%j==0)
		{
		break;
		}
	    else if(j>i/2)
	    {
		System.out.println(i);
		break;
	    }
	}
	
		
    }
}

			

		
		
	

	


