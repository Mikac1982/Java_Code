package com.class27;

public abstract class Wrestler {

	public void paymentForWork(int hours) {
		System.out.println("The wrestler will make $ "+hours*250+" for match");
	}
	
	public abstract void themeMusic(); //abstract methods
	
	public abstract void finisher();
	
	
}
