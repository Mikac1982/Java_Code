package com.Review8Again;

//create 3 instance variables in class parent 
	//and then assign values for those instance variables in your constructor class, 
	//then print those values in your main method by creating the object

public class Parent {

	String name;
	int age;
	char grade;
	
	public Parent(){
		name="john";
		age=30;
		grade='A';
		System.out.println("This is constructor");
		System.out.println(name+" "+age+" "+grade);
	}
	
	
	
	public static void main(String[] args) {
		Parent p=new Parent();
	   //System.out.println(p.name+" "+p.age+" "+p.grade);
	}
}
