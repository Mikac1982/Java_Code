package com.class28;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new PNC();
		bank.hasChecking();
		bank.hasSavings();
		bank.hasCreditCard();
		
	//	bank.hello="bye";
		System.out.println(PNC.hello); //by default it's public static final so 
		//we are calling it by class name--> static 
	}
	
	
	
}
