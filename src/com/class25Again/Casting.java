package com.class25Again;

public class Casting {

	public static void main(String[] args) {
	
		//Implicit
	double a=10; //10 is integer
	System.out.println(a); //10.0
	
	//EXPLICIT CASTING
	//int b=10.0; compiler complains, error
	
	double b=10.0;
	int c=(int)(b);
	System.out.println(c);
	
	int i=130;
	//byte b=130;  compiler wont allow
	byte by=(byte)(i);
	System.out.println(by);  //-126
	
	//UPCASTING
	Payment pay=new MasterCard(); //smaller object putting in bigger
	
	//DOWNCASTING
	//MasterCard mc=new Payment(); trying to put child class in parent class
	//                             compiler wont allow        
	
	//MasterCard mc=(MasterCard)new Payment(); //we are converting 
	MasterCard mc1=(MasterCard)pay;
	mc1.closePayment();
	mc1.makePayment();
	
	
	}
	
	
	
}
