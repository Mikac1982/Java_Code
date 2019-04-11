package com.class10;

public class Task2 {
   public static void main(String[] args) {
	
	 // Create an array of names and store all names of your group. 
	 // Then print your name from that array. (use 2 different ways of creating an array).
	   
	  String[] names= {"Farrah", "Lola","Zaki","Samir","Milena"};
	  System.out.println(names[4]);
	  
	  // second way
	  
	  String[] name=new String[5];
	  name[0]="Farrah";
	  name[1]="Lola";
	  name[2]="Zaki";
	  name[3]="Samir";
	  name[4]="Milena";
	  
	  System.out.println(name[4]);
	   
}
}
