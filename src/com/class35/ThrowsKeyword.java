package com.class35;

public class ThrowsKeyword {

	public static String name="John";
	
	public static void studentSleeping() throws InterruptedException { //throw responsibility to other method, who ever calls it
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Give some cofee to "+name);
	}
	
	public static void allStudentsSleeping() throws InterruptedException {
		studentSleeping();  //calling studentSleeping() method
	}
	
	public static void sleepMode() { //throwing until some one catch it 
		try {
			allStudentsSleeping();  //call allStudentSleeping();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)  {//JVM always calls main method
		sleepMode();  //this code is executable; calling sleepMode(); 
	}
}
