package com.class10;

public class Task123 {
   public static void main(String[] args) {
	   
	// TASK 1: Create an array of chars and store grades into it: A,B,C,D,E,F. 
	// Then print a grade B (use 2 different ways of creating an array).   
	   
	char[] grades= {'A','B','C','D','E','F' };
	System.out.println(grades[2]);
	
	//second way
	char[] grade=new char[6];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	System.out.println(grade[0]);
	
  // TASK 2: Create an array of names and store all names of your group. 
  // Then print your name from that array. (use 2 different ways of creating an array).
	
	String[] names= {"Milena", "Lola","Farrah","Zaki","Samir"};
	System.out.println(names[0]);
	
  //second way
	String[] name=new String[5];
	name[0]="Milena";
	name[1]="Lola";
	name[2]="Farrah";
	name[3]="Zaki";
	name[3]="Samir";
	System.out.println(name[0]);
	
  // TASK 3:Create an array of words: Java, Saturday, day, coding, is.
  // Print the following sentence using element of array: “Saturday is Java coding Day”.
	
	String[] words= {"Java","Saturday","day","coding","is"};
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
	String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
	System.out.println(sentence);
	
	int size=words.length;
	System.out.println("The size of an array is "+size);
	
}
}
