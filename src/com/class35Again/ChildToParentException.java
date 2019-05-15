package com.class35Again;

public class ChildToParentException {

	public static void main(String[] args) {
		
		
		int[] array= {15, 44, 8};
		
		try {
		    System.out.println(array[3]);  //new ArrayIndexOutOfBoundsException
		    Thread.sleep(2000);            //new InterruptedException
	
		//from more specific to the less specific catch block	
		}catch(InterruptedException e) {
			
		}catch(ArithmeticException e)	{
		
		 //any exception we can put into Exception-> can handle all exception but it should be at the end
		}catch (Exception e) {  //generic exception
			
		}
		System.out.println("Code after an exception");
		
		ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException();
		Exception e1=new ArrayIndexOutOfBoundsException(); //giving reference to the parent
		
		
	}
}
