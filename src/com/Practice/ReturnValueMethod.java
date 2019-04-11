package com.Practice;

public class ReturnValueMethod {

	public static void main(String[] args) {
		
		String str = "Hello";
      
		int stringLength=str.length();   //int str length=5
		System.out.println(stringLength);
		
		char character=str.charAt(3);
		System.out.println(character);
		
		ReturnValueMethod obj=new ReturnValueMethod();
		//String str=obj.askHowAreYou("Asel");
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
		
	//	int num=obj.findLargestNum(20, 10);
		int largestNum=obj.findLargestNum1(20, 10);
		
		boolean isOdd;
		
		if (largestNum%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		System.out.println(isOdd);
		
	}
	
	void askHowAreYou(String name) {// parameter
		System.out.println("How are you " + name);
	}
	
	String whatIsADay() {
		System.out.println("I am inside of a method");
	   return "Thursday";
	}
	
	void findLargestNum(int a, int b) {

		if (a > b) {
			System.out.println("A is largar than B");
		} else {
			System.out.println("B is largar than A");
		}
	}
	int findLargestNum1(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}