package com.class24;

public class Parents {

	public void love() {
		System.out.println("Parents love");
	}
	public void work() {
		System.out.println("Parents work");
	}
	
	public static void main(String[] args) {
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		Childs childs=new Childs();
		childs.love();  //overriding method
		childs.work();
		childs.cry();
		
		Parents obj=new Childs();
		obj.love();  //Child love
		obj.work();  //Parents work
	  //obj.cry();
		
	}	
}

class Childs extends Parents{
	
	public void love() {
		System.out.println("Child love"); //overriding method
	}
	public void cry() {
		System.out.println("Child cry");
	}
}

