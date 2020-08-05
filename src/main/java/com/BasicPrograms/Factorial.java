package com.BasicPrograms;

public class Factorial {

	public static void main(String[] args) {
	int num=7;
	int temp = 1;
    Factorial fact=new Factorial();
    int ans=fact.fact(num, temp);
    System.out.println(ans);
	}
	public int fact(int num,int temp)
	{
		int i=num;
		while(i>=1)
	    {
	       if(i==num)
	       temp=i;
	       else if(i<num)
	    	{
	    	  temp=temp*i;
	    	}
	    	i--;
	    }
		return temp;
	}

}
