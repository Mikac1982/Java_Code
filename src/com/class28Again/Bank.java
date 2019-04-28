package com.class28Again;

public interface Bank {   //INTERFACE
	//by default all variables inside Interface are PUBLIC STATIC FINAL
	static String name="Bank";
	String hello="hi"; //by default it will be public static final
	
   //by default compiler adds PUBLIC and ABSTRACT to every method
	 public void hasChecking();   // ONLY abstract methods
	 void hasSavings();
	 void hasCreditCard();
	
    // static void hasLoan(); can NOT have STATIC abstract method
	 
	// Bank(){ interface can NOT HAVE any CONSTRUCTOR
	// }
}
class BOA implements Bank{  //to make relationship between Class and Interface, we use keyword IMPLEMENTS 
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
		System.out.println("BOA has 10 different credit cards");
	}
}
class PNC implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 7 different credit cards");
	}
	
	public void hasLoan() { //specific to PNC child class
		System.out.println("PNC has loan");
	}
	
}