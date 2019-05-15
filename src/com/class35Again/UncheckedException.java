package com.class35Again;

public class UncheckedException {

	public static void main(String[] args) {
		
		//UNCKECKED EXCEPTION == RUN-TIME EXCEPTION
		//exception that might occur but it's NOT checked by compiler
		
		int[] array= {12,13,12};
	//	System.out.println(array[3]); //ArrayIndexOutOfBoundsException: 3
		
		String a="Hello";
	//	System.out.println(a.charAt(5)); //StringIndexOutOfBoundsException:
		
	//	new StringIndexOutOfBoundsException();
	//  new ArrayIndexOutOfBoundsException();
		
	    String str=null;  //empty, we atre trying to get length of the empty string 
	    System.out.println(str.length()); //NullPointerException
		
		
		
		
	}
}
