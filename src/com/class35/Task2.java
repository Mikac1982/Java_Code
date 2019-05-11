package com.class35;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	// Create a static method that will return a List of Exceptions.
	// Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
	// Call your method inside main and print name and details of all Exception objects.
	
	public static void main(String[] args) {
		
		List<Exception> exceptionList=getList(); 
		System.out.println(exceptionList.size());
		
		for (Exception singleException:exceptionList) {
			System.out.println(singleException);
		//	System.out.println(singleException.getMessage());
		}
	}
	
	public static List<Exception> getList(){
		
		List<Exception> list=new ArrayList<>();
		//1 try catch for ArithmeticException
		try {
		     System.out.println(10/0);	
		}catch (ArithmeticException ae) {
			list.add(ae);
		}
		//2 try catch for ArrayIndexOutOfBoundsException
		int[] array= {12,13};	
		try {
		System.out.println(array[2]);
		}catch(ArrayIndexOutOfBoundsException aioe) {
			list.add(aioe);
		}
		
		//3 try catch for InputMismatchException
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		
		try {
			int num=scan.nextInt();
		}catch (InputMismatchException imme) {
			list.add(imme);
		}
		
		//4 try catch for NullPointerException
		String str=null;
		try {
			System.out.println(str.length());
		}catch ( NullPointerException npe) {
			list.add(npe);
		}
		
		return list;
		
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
