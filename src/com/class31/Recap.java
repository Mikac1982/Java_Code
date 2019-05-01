package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
      int a=10;  //variables- can store just one value 
      int b=20;
      System.out.println(a+" "+b);
      
      int[] array= {10, 10, 20, 20}; //fixed in size and store just homogeneous values/same type 
	  
      //GENERIC ArrayList -just storing values of Integer Class
      ArrayList<Integer> numbers=new ArrayList<Integer>();
      numbers.add(12);     //method comes from Collection - Parent 
      numbers.add(0, 13);  //method specific to all LIST Objects
      numbers.add(0, 14);
      System.out.println(numbers.size());  //3
      System.out.println(numbers.get(0));  //14
      System.out.println(numbers.get(1));  //13
	  System.out.println(numbers.get(2));  //12
	  
	  numbers.set(1, 33);
	  System.out.println(numbers.get(1)); //replace value at specific index (1)
	  
	  System.out.println(numbers.contains(33));  //true - we have object with value 33
	  
	  //1.way using for loop
	  System.out.println("------using For Loop-------");
	  for (int i=0; i<numbers.size(); i++) {
		  System.out.println(numbers.get(i));
	  }
	  //2.way using Advanced For Loop
	  System.out.println("----using Advanced For Loop-------");
	  for (Object num : numbers) {
		  System.out.println(num);
	  }
	  //3.way using Iterator
	  System.out.println("------using Iterator method-------");
	  Iterator <Integer> it=numbers.iterator();
	  //Iterator it=numbers.iterator(); you can maki it non-generic
	  //it.hasNext();
	  //it.next();
	  // it.remove();
	   while(it.hasNext()) {
		  int number=it.next();
		  System.out.println(number);
		  
	  //4.way using WhileLoop
	  System.out.println("------using WHILE Loop-------");  
	  int c=0;                      //1. initialization outside of loop 
	  
	  while(numbers.size()>c) {     //2. condition
		  int myNum=numbers.get(c); //3. access element based of index
		  System.out.println(myNum);
		  c++;   //adding controler
	  }
	  
	  
	  
	  
	  
	  }
	}
}
