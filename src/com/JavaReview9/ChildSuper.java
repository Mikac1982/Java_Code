package com.JavaReview9;

public class ChildSuper extends MainSuper{
		
	String name="boy"; 
	boolean lettuce=false;
	char grade='A';
	
	
	 ChildSuper(String a){
		 super(a);
		System.out.println("This is from child with 1 parameter "+a);
	 }
	 
	 ChildSuper(String a, String b){
		 super(a,b);
		System.out.println("This is from child with 2 parameter "+b);
	 }
	 
	 public void getDetails() {
		
		System.out.println(super.name+" "+super.lettuce+" "+super.grade); 
		System.out.println(name+" "+lettuce+" "+grade); //we can use this. as well
	 }
	 
	public static void main(String[] args) {
			
			ChildSuper obj1=new ChildSuper("hello","bye");
			ChildSuper obj2=new ChildSuper("yes");
			System.out.println("-----------------------");
			obj1.getDetails();
		}
		
	}
	
	

