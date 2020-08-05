package com.Constructors;
//Constructor can be Overloaded
public class OverLoad {
	public OverLoad()
	{
		System.out.println("No Parameters");
	}
	public OverLoad(String S)
	{
		System.out.println("String Parameter");
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		OverLoad o=new OverLoad();
		@SuppressWarnings("unused")
		OverLoad oa=new OverLoad("");
		
	

	}

}
