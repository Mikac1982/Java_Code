package com.class26Again;

public class Car {

	public void drive() {
		System.out.println("Cars drives");
	}
	public void drive(int speed) { //overloading method
		System.out.println("Cars drives with speed "+speed);
	}
}

class BMW extends Car{
	public void drive() { //overriding method
		System.out.println("BMW drives fast");
	}	
}

class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota drives safe");
	}
}