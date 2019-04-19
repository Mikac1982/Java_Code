package com.class25;

public class Student {

	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomework() {
		System.out.println("Students must do homework");
	}
	void attendClasse(String str, int num) {
		System.out.println("Students must attend the classes");
	}
	//PRIVATE METHODS CAN NOT BE OVERRIDEN
	private void doResearch() {
		System.out.println("Students must do research");
	}
}
