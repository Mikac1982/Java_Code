package com.class24again;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		BOA boa=new BOA();   //child class
		PNC pnc=new PNC();   //child class
		
	//	System.out.println(bank.chargeInterest());  OR:
		
		int interestRate; //declaring reference variable
		
		interestRate=bank.chargeInterest();
		System.out.println("Bank charges interest ="+interestRate);
		
		interestRate=boa.chargeInterest();   //reassigning the value
		System.out.println("BOA charges interest ="+interestRate);
		
		interestRate=pnc.chargeInterest();   //reassigning the value
		System.out.println("PNC charges interest ="+interestRate);
	} 
	
	
	
}
