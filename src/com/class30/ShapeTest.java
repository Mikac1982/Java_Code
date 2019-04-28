package com.class30;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle obj1=new Circle();
		obj1.calculateArea(20.5);
		obj1.calculatePerimiter(40);
		obj1.whoAmI();
		
		
		Shape obj2=new Circle();
		obj2.calculateArea(10);
		obj2.calculatePerimiter(20);
	//	obj1.whoAmI(); //not available
		
	}
	
	
}
