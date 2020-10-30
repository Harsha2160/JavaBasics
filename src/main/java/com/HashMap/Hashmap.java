package com.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Hashmap {
//HashMap is a class that implements Map Interface.
//It Extends AbstractMap class.
//It contains only Unique Elements.
//Format-Key,value pair.
//It may have one null key and Multiple null values.
//It maintains no order. 
//HashMap is non-synchronized--not thread safe 
public static void main(String[] args) {
HashMap<Integer,Employee>hm=new HashMap<Integer,Employee>();
TreeMap<Integer,Employee>tm=new TreeMap<Integer,Employee>();
Employee emp1=new Employee("Harsha", 25, "QE");
Employee emp2=new Employee("Tom", 25, "QE");
Employee emp3=new Employee("Peter", 25, "QE");
hm.put(1, emp1);
hm.put(2, emp2);
hm.put(3, emp3);
for(Entry<Integer, Employee> m : hm.entrySet())
{
	int key=m.getKey();
	System.out.println(key);
	Employee e=m.getValue();
	System.out.println(e.name+" "+e.age+" "+e.dept);
}
tm.putAll(hm);
System.out.println(tm);

}
}
