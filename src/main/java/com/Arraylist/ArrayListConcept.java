package com.Arraylist;

import java.util.ArrayList;

//Array length is fixed. ArrayList is flexible.
//ArrayList allows duplicates and follows insertion order.
public class ArrayListConcept {

	public static void main(String[] args) {
    ArrayList<Object>ar=new ArrayList<Object>();
    ar.add("Harsha");
    ar.add("Harsha");
    ar.add(10);
    ar.remove(ar.get(0));
    for (int i = 0; i < ar.size(); i++) {
    
    System.out.println(ar.get(i));
		
	}
    
    
    

	}

}
