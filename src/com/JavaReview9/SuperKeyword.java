package com.JavaReview9;

class ParentSuper{
	String Parent="Parent";
	
	ParentSuper() {
		System.out.println("parent");
	}
	void hello() {
		System.out.println();
	}
	
}

public class SuperKeyword extends ParentSuper{
	String Parent="Child";
	
    void hello() {
    	super.hello();
    			System.out.println(this.Parent);  //Child
    			System.out.println(super.Parent); //Parent
	}
	SuperKeyword(){
		super(); //by default compiler calls this parent constructor 
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		
		SuperKeyword obj=new SuperKeyword();
		obj.hello();
	}
}
