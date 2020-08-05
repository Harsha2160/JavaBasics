package com.Arrays;



/**
 * Hello world!
 *
 */
public class PrimaryClass 
{
	
    public static void main( String[] args )
    {
    	
    	
        PrimaryClass PC=new PrimaryClass();
        int c[]=PC.method1();
        System.out.println(c[0]+" - "+c[1]);
        
        
    	}
    	
    	
    	
    public int[] method1()
    {
    	
    	int application[]=null;
    	application=new int[2];
    	SecondaryClass SC=new SecondaryClass();
    	application[0]=SC.method2();
    	application[1]=10;
		return application;
    }
    }
    	

