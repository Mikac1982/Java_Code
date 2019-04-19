package com.javaReview8;

public class GameConsole {
  /*Create a class called GameConsole create all the actions gaming console with attributes of color,
   * and a method readingDisk have that method print i can read game disk,
   * have another method with a return type that display the number of disk it can play at a time.
   * then create PS4 class, and create Xbox class have them extend from console class
   * and read those actions and attributes
   * 
   */
	String controller;
	int numberOfController;
	String powerSource;
	boolean cd;
	boolean ifTvNeeded;
	
	void ableToPlay() {
		System.out.println("I can play Games");
	}
	
	void readDisk() {
//	String a="dont need print";
    System.out.println("I can read disk");
	}
	
	boolean surfWeb() {
		return true;
	}
	boolean portable() {
		return false;
	}
	
	
	
	
	
	
}
