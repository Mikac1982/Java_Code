package com.class26Again;

public class SuperKeyword {

	String name="John";
	
	public void sayName() {
		System.out.println("Parent name is "+name);
	}
}
class ChildOfSuperKeyword extends SuperKeyword{
	 
	 String name="Michael";
	 
	 public void sayName() {
		 System.out.println("Parent name is "+super.name); //reference to call super/parent ]variable
		 System.out.println("Child name is "+name);
	 }
	 
	 public void callingMthods() {
		 sayName(); //by default this.sayName() //calling Child class sayName method
		 super.sayName(); //calling Parent class method sayName
	 }
	 
 }