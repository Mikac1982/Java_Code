package com.class11;

public class Task4 {
   public static void main(String[] args) {
	
	// Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	// After storing values print the following:
	// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.   
	   
	String[][] n= { 
			{"Mr","Mrs","Ms","Miss"},
			{"Smith","Jordan","Jackson","Obama"}
	};
	
	System.out.println(n[0][1]+" "+n[1][0]+", "+n[0][0]+" "+n[1][3]+", "+n[0][2]+" "+n[1][2]+", "+n[0][3]+" "+n[1][1]);
	
	// second way: using new keyword 
	String[][] name=new String[2][4];
	
	name[0][0]="Mr";
	name[0][1]="Mrs";
	name[0][2]="Ms";
	name[0][3]="Miss";
	
	name[1][0]="Smith";
	name[1][1]="Jordan";
	name[1][2]="Jackson";
	name[1][3]="Obama";
	
	System.out.println(name[0][1]+" "+name[1][0]);
	System.out.println(name[0][0]+" "+name[1][3]);
	System.out.println(name[0][2]+" "+name[1][2]);
	System.out.println(name[0][3]+" "+name[1][1]);
	
	   
}
}
