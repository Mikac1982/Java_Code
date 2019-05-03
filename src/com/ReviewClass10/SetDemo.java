package com.ReviewClass10;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	
	//SET - does not support duplicate values
	//HashSet -not give you elements in sequence (not in order)	
	Set<Integer> values=new HashSet<>();
	
	System.out.println(values.add(130));
	System.out.println(values.add(240));
	System.out.println(values.add(430));
	System.out.println(values.add(10)); //false -> you can not have duplicate values
	
	for (int i: values) {
		System.out.println(i);
	}	
		
	}
	
	List<Integer> num= new ArrayList<Integer>();
	
	
	
}
