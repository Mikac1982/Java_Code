package com.class24;

public class Testing {

	public static void main(String[] args) {
		String a;
	    a="10";
	    double d=12;  //we can put integer in double
	    
	Parent parent=new Parent(); //reference variable-parent (type of parent)
	parent.love();
	parent.work();
	
	Child child=new Child(); //creating object of Child, assigning object to the reference variable child(type child)
	child.love(); // method overriding
	child.cry();  //own method
	child.work();
	
	//Child obj=new Parent();  NOT POSSIBLE cause 
	//TYPE CASTING 
	//achieving run time polymorphism
	
	Parent obj=new Child(); //creating object of Child, reference variable giving to Parent class
	obj.work();  //Parents work
	obj.love();  //Child love - common method(overriding) is accessible to Parent ref var
	//obj.cry(); NOT ACCESSIBLE! this is just child method!
	
	
	}	
}
