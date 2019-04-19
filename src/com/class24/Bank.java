package com.class24;

//PARENT CLASS
public class Bank {  //public class can be only 1

	public int chargeInterest() {
		return 0;
	}
}
//child 1 class
class BOA extends Bank {          //second way of inheritance classes!
	@Override // ANNOTATION-tells you if you are overriding or not
	public int chargeInterest() {
		return 2;
	}	
}
//child 2 class
class PNC extends Bank {
	
	public int chargeInterest() {
		return 3;
	}
}
//method with the SAME NAME and SAME PARAMETERS exists in PARENT and CHILD CLASS --> METHOD OVERRIDING!