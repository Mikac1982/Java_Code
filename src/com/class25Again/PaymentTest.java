package com.class25Again;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent=new Payment();
		parent.makePayment();
		
	    MasterCard mc=new MasterCard();
	    mc.makePayment();
	
	    Visa visa=new Visa();
	    visa.makePayment();
	    visa.annualFee();
	    
	    //UPCASTING-achieving RUN TIME polymorphism
	    
	    // pay-reference variable
	    //Payment - type of reference variable
	    //new MasterCard(); - creating an Object of a Child Class
	    Payment pay=new MasterCard();
	    pay.closePayment();
	    pay.makePayment(); //overriding method from child class
	    
	   Payment pay1=new Visa();
	   pay1.closePayment();
	   pay1.makePayment();
	//   pay.annualFee(); //error- method is undefined
	    
	    
	    
	    
	}	
}
