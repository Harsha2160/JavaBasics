package com.BasicPrograms;



public class String_Reversal{

	public static void main(String[] args) {
	
	String s="SELENIUM";
	String rev="";
	for(int i=(s.length()-1);i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);

}
}
