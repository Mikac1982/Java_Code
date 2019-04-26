package com.class28;

public interface Bank {
	
	static String name="Bank";
	String hello="hi"; //by default it will be PUBLIC STATIC FINAL
	
//by default compiler adds PUBLIC & ABSTRACT to every method 
	void hasChecking();
	void hasSavings();
	void hasCreditCard();
	
//	static void hasLoan(); can NOT have static abstract methods
}
class BOA implements Bank{
   @Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 saving accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
	}
	public void hasLoan() {
		System.out.println("PNC has loan");
	}
}
class PNC implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 saving accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc");
	}
	
}