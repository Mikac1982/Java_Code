package com.class11;

public class RecapAg {
   public static void main(String[] args) {
	
  // create an array of names that will hold 5 elements and retrieve all values 
	   
  // 1. create an array using new keyword   
	String[] names=new String [5];
	
	names[0]="Mika";
	names[1]="Una";
	names[2]="Mama";
	names[3]="Danilo";
	names[4]="Dragana";
	   
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]+" ");
	} 
  // 2. create an array using array literal  
	String[] familyName= {"Mika", "Una", "Mama", "Danilo", "Dragana"};
	
	System.out.println("-------For loop-------");
	
	for (int i=0; i<familyName.length; i++)   {
		System.out.println(familyName[i]);
	}
	   
	// retrieve values using: advanced for loop, foe each loop, enhanced for loop   
	 
	System.out.println("--------For Each loop--------");
	 for (String members:familyName) {
		 System.out.println(members);
	 } 
	   
	   
	   
}
}
