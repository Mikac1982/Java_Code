package com.class24Again;
//Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”.
		// Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and ‘Postgraduate’
		// each having a method with the same name that prints “I am an Undergraduate” 
		// and “I am a Postgraduate” respectively. 
		// Call the method by creating an object of each of the three classes.
		
public class Degree {
	public void getDegree() {
	System.out.println("I got a degree");	
    }
	
	public static void main(String[] args) {
		
		Degree degree=new Degree();
		degree.getDegree();
		Undergraduate under=new Undergraduate();
		under.getDegree();
		Postgraduate post=new Postgraduate();
		post.getDegree();
	}
}

class Undergraduate {
	public void getDegree() {
		System.out.println("I am an Undergraduated");	
	    }
}

class Postgraduate {
	public void getDegree() {
		System.out.println("I am an Postgraduated");	
	    }
}

 
	  
	  
  



