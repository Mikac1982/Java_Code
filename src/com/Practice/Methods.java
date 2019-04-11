package com.Practice;

public class Methods {
   //Create a method that ask different people how are you 
	
	public static void main(String[] args) {
		
		Methods obj=new Methods();
		obj.askHowAreYou("Milena");	 //we call just one matching method and it is getting executed
		
	}
	
	void askHowAreYou(String name) {  //we have to specify type in parameter
		System.out.println("How are you "+name+"?");
	}
	void askHowAreYou1(String name) {
		System.out.println("How are you "+name+"?");
	}
	
	void askHowAreYou2(String name) {
		System.out.println("How are you "+name+"?");
	}
	
	
	
	
	
	
}
