package com.class26;
	
		/* A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
		 *  We have to print the money deposited by him in a particular bank.
		 *  Create a class ‘Bank’ with a method ‘getBalance’ which returns 0. 
		 *  Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ 
		 *  with a method with the same name ‘getBalance’ which returns the amount deposited in that particular bank.
		 *  Call the method ‘getBalance’ by the object of each of the three banks.
		 */

public class Bank {
	int deposite;
	public void getBalance() {
		System.out.println("Bank returns 0");
	}		
}
class BankA extends Bank{
	public void getBalance() {
		deposite=1000;
		System.out.println("Bank A returns "+deposite+"$");
	}
//	public final void getBalance(int a) {   we can overload final method
		//deposite=1000;
//		System.out.println("Bank A returns "+deposite+"$");
//	}
}
class BankB extends Bank{
	public void getBalance() {
		deposite=1500;
		System.out.println("Bank B returns "+deposite+"$");
	}
}
class BankC extends Bank{
	public void getBalance() {
		deposite=2000;
		System.out.println("Bank C returns "+deposite+"$");
	}
}