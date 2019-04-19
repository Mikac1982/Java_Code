package com.class24;

public class Test {
    
	//method overloading NOT POSSIBLE by changing RETURN TYPE cause ..
	//.. method signature is still the same (name+parameters)
	
  //	public int test() {
  //        System.out.println("I am a public method");
  //	    return 5;
  //    }
	
	public int test(double a) {
		System.out.println("I am a public method");
		return 3;
	}
	
	public void test() {
		System.out.println("I am a public method");
	}
	protected void test(String str) {
		System.out.println("I am protected method");
	}
    void test(String str, int num) {
		System.out.println("I am default method");
	}
	private void test(int num) {
		System.out.println("I am private method");
	}
	
	
	
	
}
