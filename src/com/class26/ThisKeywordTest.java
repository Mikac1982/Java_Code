package com.class26;

public class ThisKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(10, 20); //getting loaded to constructor-line 7
		obj.sum(100, 200); //getting loaded to the method-line 12
		
		System.out.println("--------------");
		ThisKeyword obj1=new ThisKeyword(); //instance variables=0
		obj1.sum(12, 13);//values of local variables =25
		
	}
	
	
}
