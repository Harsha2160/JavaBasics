package com.Interface;
//Unlike Classes, Interfaces support multiple Inheritance. 
//Child can inherit from both Parents at the same time.
//But Multiple Children cannot inherit from single Parent at the same time.
public interface Child extends Father,Mother {
	public int m3(int a,int b);

}
