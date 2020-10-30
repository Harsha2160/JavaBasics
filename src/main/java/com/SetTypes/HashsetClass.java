package com.SetTypes;

import java.util.ArrayList;
import java.util.HashSet;
//We have replace method only in Map and List interface
//We have remove and add in Set and List.
//We have remove in Set,List and Map.
public class HashsetClass {

	public static void main(String[] args) {
    ArrayList<Integer>a=new ArrayList<Integer>();
	for(int i=0;i<=9;i++)
	{
		a.add(i);
	}
	HashSet<Object> hs=new HashSet<Object>();
	hs.add("Harsha");
	hs.add(3);
	hs.add("Abhilash");
	hs.addAll(a);
	System.out.println(hs);
	hs.removeAll(hs);

	}

}
