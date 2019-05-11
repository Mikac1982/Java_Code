package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		
		int[] array= {17, 99, 8};
		
		try {
			Thread.sleep(2000);           // new InterruptedException
		    System.out.println(array[3]); // new ArrayIndexOutOfBoundsException
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		//any exception we can put into Exception-> can handle all exception but it should be at the end
		}catch(Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.println("Code after an exception");
		
	//	ArrayIndexOutOfBoundsException e= new ArrayIndexOutOfBoundsException();
		//creating an object of a parent class Exception
	//	Exception e1=new ArrayIndexOutOfBoundsException(); 
		
		
		
		
		
		
		
		
	}
}
