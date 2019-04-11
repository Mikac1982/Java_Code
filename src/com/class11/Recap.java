package com.class11;

public class Recap {
   public static void main(String[] args) {
	
	// create an array of names that will hold 5 elements and retrieve all values 
	   
	// 1. create an array using new keyword
	String[] names=new String[6];
	
	names[0]="Asel";   
	names[1]="Awet";
	names[2]="Arif";
	names[3]="Weqas";
	names[4]="Dzmitri";
	names[5]="Shiva";   
//	names[6]="Sandesh";  // will get an runtime exception when trying to access it
	
	 for (int i=0; i<names.length; i++)  {
		 System.out.println(names[i]);
	 }
	   
	 // 2. create an array using array literal
	                       // 0         1      2        3      4       5
	 String[] studentNames={"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
	 
	 System.out.println("------For loop---------");  
	 for (int i=0; i<=studentNames.length-1; i++)  {
		 System.out.println(studentNames[i]);
	 } 
	 // retrieve values using: advanced for loop, foe each loop, enhanced for loop 
	 System.out.println("_____Advanced for loop------");
	 
	 for(String student:studentNames) {
		 System.out.println(student);
	 }
}
}
