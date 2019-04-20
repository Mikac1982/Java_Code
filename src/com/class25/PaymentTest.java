package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent=new Payment();
		parent.makePayment();
		//accessing child method
		MasterCard mc=new MasterCard();
	    mc.makePayment();
	    
	    Visa visa=new Visa();
	    visa.makePayment();
	    visa.annualFee();
	    
	   //UPCASTING  
	   //pay - reference variable; 
	   //Payment- type of reference variable 
	   //new Master(); -creating an Object of a Child Class
	   Payment pay =new MasterCard();  //achieving RUN TIME polymorphism 
	   //any method that exist in parent and common in child
		pay.closePayment();  //All payments need to be closed
		pay.makePayment();  //We can make payment with MC and 2% fee
		
		//UPCASTING and achieving RUN-TIME polymorphism 
		Payment pay1=new Visa(); //object of the Child class is created and giving reference to the Parent class
		pay1.closePayment();
		pay1.makePayment(); //We can make payment with Visa and 1.5% fee
    //  pay.annualFee(); // error-method is is undefined for the type Payment
		
		
		
		
		
	}
	
	
	
}
