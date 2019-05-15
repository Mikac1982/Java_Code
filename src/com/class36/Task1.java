package com.class36;

public class Task1 {
    //Create an exception when user is trying to withdraw larger amount than the balance
	//throw an exception saying "You do not have enough money"
	
	public static void main(String[] args) {
		
		withdraw(25000, 27000);	
	}
	public static void withdraw(double balance, double wantedAmount) {
		if (balance>wantedAmount) {
			System.out.println("You got your money");
		}else {
			throw new ArithmeticException("Sorry, you do not have enough money");
		}
	}
}
