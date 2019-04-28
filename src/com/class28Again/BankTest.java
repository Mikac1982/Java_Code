package com.class28Again;

public class BankTest {

	public static void main(String[] args) {
		//we can create object of a child class and give a reference to a parent class
		Bank bank=new PNC();
		bank.hasChecking();
		bank.hasSavings();
		bank.hasCreditCard();
		
		//accessible true the Class name
		System.out.println(Bank.hello); //hi
		System.out.println(PNC.hello);
		
		
		
		
		
		
		
		
	}
	
}
