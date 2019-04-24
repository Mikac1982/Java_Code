package com.class26Again;

public class ThisKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(10, 20); //when create object we passing values to constructor
		obj.sum(100, 200);  //when we calling method we are passing values to local variables 
		
		System.out.println("------------------");
		ThisKeyword obj1=new ThisKeyword(); //0
		obj1.sum(12, 13);   //25
	}
}
