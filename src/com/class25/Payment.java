package com.class25;

public class Payment {

	public void makePayment() { //OVERRIDEN method
		System.out.println("We can make a payment with no fee");
	}
	public void closePayment() {
		System.out.println("All payments need to be closed");
	}
}

class MasterCard extends Payment{
	
	public void makePayment() { //OVERRIDING method
		System.out.println("We can make payment with MC and 2% fee");
	}	
}	
class Visa extends Payment{
	
	public void makePayment() { //OVERRIDING method
		System.out.println("We can make payment with Visa and 1.5% fee");
	}
	public void annualFee() {  //behavior that belongs only to the child class
		System.out.println("Visa card has annual fee");
	}
}	
	
	

