package com.class26;

//Write program: Shape class has a constructor that takes the radius and extend circle class. 
//Print area of circle while creating and Object of a child class.
 
public class Circle {
	
	int r;
	double pi=3.14;
	
}
class Shape extends Circle {

	Shape(int r){
		super.r=r;
		System.out.println("Area of a circle with radiuus "+r+" is: "+(pi*r*r));
	}
}