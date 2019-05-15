package com.class35Again;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	// Create a static method that will return a List of Exceptions.
	// Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
	// Call your method inside main and print name and details of all Exception objects.
		
	
	public static List<Exception> getList(){
		
	List<Exception> list=new ArrayList<>();	
	
	//1 try catch for ArithmeticException
	try {
		System.out.println(10/0);
	}catch(ArithmeticException ae) {
		list.add(ae);                      //java.lang.ArithmeticException: / by zero
	}
	
	//2 try catch for NullPointerException
	String str=null;
	try {
		System.out.println(str.length());
	}catch(NullPointerException npe) {
		list.add(npe);                    //java.lang.NullPointerException
	}
	
	//3 try catch for ArrayIndexOutOfBoundsException
	int[] array= {3,5,8};
	try {
		System.out.println(array[4]);
	}catch(ArrayIndexOutOfBoundsException aiobe) {
		list.add(aiobe);                           //java.lang.ArrayIndexOutOfBoundsException: 4
	}
	
	//4 try catch for InputMismatchException
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number");
	try {
		int num=scan.nextInt();
	}catch(InputMismatchException ime) {
		list.add(ime);                      //java.util.InputMismatchException
	}
	return list;		
	}
	
   public static void main(String[] args) {
	   List<Exception> exceptList=getList();
	   System.out.println(exceptList.size());
	   
	  for (Exception except:exceptList) {
		  System.out.println(except);
	  }
	   
	}
	
	
	
	
	
	
	
}
