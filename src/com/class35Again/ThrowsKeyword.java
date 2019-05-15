package com.class35Again;

public class ThrowsKeyword {

	public static String name="John";
	
	                                   //throw responsibility to other method, who ever calls it
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(2000); 
		//2 possibilities: 1.try and catch  2. throws
		System.out.println("Give some coffee to "+name);
	}
	                 //delegating responsibility to other method caller
	public static void allStudentsSleeping() throws InterruptedException {
		studentSleeping();
	}
	      //this method is catching the exception 
	public static void sleepMode()  {        //throwing until some one catch it 
		try {
			allStudentsSleeping();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
		sleepMode();
	}
	
}
