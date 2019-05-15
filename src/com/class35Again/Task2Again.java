package com.class35Again;

import java.util.*;

public class Task2Again {
	// Create a static method that will return a List of Exceptions.
	// Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
	// Call your method inside main and print name and details of all Exception objects.
			
	public static void main(String[] args) {
		
		List<Exception> excptList=getList();   //method getList() returns List of Exception 
		System.out.println(excptList.size());  //5
		
		for (Exception singleException:excptList) { //to get all the details 
			System.out.println(singleException); //(singleException.getMessage()
		}
	}
	
	public static List<Exception> getList(){
		
		List<Exception> list=new ArrayList<>();
		
		//1. try and catch for ArithmeticException
		try {
		     System.out.println(10/0);
		}catch (ArithmeticException ie) {
			list.add(ie);
		}
		
		//2. try and catch for StringIndexOutOfBoundsException
		String str="Hello";
		try {
		System.out.println(str.charAt(6));
		}catch (StringIndexOutOfBoundsException siob) {
			list.add(siob);
		}
		
		//3. try and catch for NullPointerException
		String str1=null;
		try {
		    System.out.println(str1.length());
		}catch (NullPointerException npe) {
			list.add(npe);
		}
		
		//4. try and catch for InputMismatchException
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		try {
			int num=scan.nextInt();
		}catch (InputMismatchException ime) {
			list.add(ime);
		}
		
		//5. try and catch for ArrayIndexOutOfBoundsException
		int[] arr= {12,14};
		try {
		    System.out.println(arr[3]);
		}catch (ArrayIndexOutOfBoundsException aiob) {
			list.add(aiob);
		}
		
		return list;
	}
	
		
		
		
		
		
		
		
	
}
