package com.class24;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank();  //parent class
		BOA boa=new BOA();     //child class
		PNC pnc=new PNC();     //child class
		
		int interestRate;  //declaring reference variable
		
		//true bank.we are accessing method in Bank class
		interestRate=bank.chargeInterest(); //instance method
		System.out.println("Bank charges interest="+interestRate);
		
		interestRate=boa.chargeInterest();   //reassigning the value
		System.out.println("BOA charges interest="+interestRate);
		
		interestRate=pnc.chargeInterest();   //reassigning the value
		System.out.println("PNC charges interest="+interestRate);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
