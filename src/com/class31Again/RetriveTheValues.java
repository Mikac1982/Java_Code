package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class RetriveTheValues {

	public static void main(String[] args) {
		
		 ArrayList<Integer> numbers=new ArrayList<Integer>();
	      numbers.add(12);     //method comes from Collection - Parent 
	      numbers.add(0, 13);  //method specific to all LIST Objects
	      numbers.add(0, 14);
	 //   System.out.println(numbers.size());  //3
	 //   System.out.println(numbers.get(0));  //14
	 //   System.out.println(numbers.get(1));  //13
	 //	  System.out.println(numbers.get(2));  //12
	
	      //4 ways to RETRIVE ALL THE VALUES:
	System.out.println("-------using For Loop------");	
	for (int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}	
		
	System.out.println("--------using Advanced For Loop--------");	
	for (Integer num : numbers) { //or (int num:numbers) or (Object num:numbers)
		System.out.println(num);
	}	
		
	System.out.println("--------uisng Iterator-------");	
	Iterator<Integer> it=numbers.iterator();	
	//hasNext(); next(); remove();
	while(it.hasNext())	{  //enter collection and check if there is next object/element
		int num=it.next();  //gives you(return) that next Object and store inside variable(print)
		System.out.println(num);
	}
	
	System.out.println("-----using While Loop---------");
	
	int c=0;                       //1. initialization (always outside the loop)
    while (numbers.size()>c) {     //2. condition (has to be true)
    	int myNum=numbers.get(c);  //accessing the values 
    	System.out.println(myNum); //and print it
    	c++;                       //3. incrementing
    }
	
		
	}
}
