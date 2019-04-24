package com.class26Again;

public class Bank {
 public int deposit;
	public void getBalance() {
		System.out.println("Money deposit is 0");
	}
}
class BankA extends Bank{
	public void getBalance() {
		deposit=1000;
		System.out.println("Money deposit in bank A is "+deposit+"$");
	}
}
class BankB extends Bank{
	public void getBalance() {
		deposit=1500;
		System.out.println("Money deposit in bank B is "+deposit+"$");
	}
}
class BankC extends Bank{
	public void getBalance() {
		deposit=2000;
		System.out.println("Money deposit in bank C is "+deposit+"$");
	}
}