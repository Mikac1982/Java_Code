package com.class23;

public class Task1 {

	//Create 1 class in which create a methods that will calculate the area of: rectangle, square, box.
	//Use separate class to test your code
	
	//area of rectangle - width*length(5*4)
	//area of a square - width*width (4)
	//area of a box - width+length*height (3*4*5)
	//area of a cube - 6*(width*length)
	
	//public int getArea(int a, int b) {
	//	System.out.println("The area of a rectangle is "+(a*b));
	//	return a*b;
	//}  compiler gives an error -NO RETURN TYPE
	
	public void getArea(int a, int b) {
		System.out.println("The area of a rectangle is "+(a*b));
	}
	
    public void getArea(int a) {
		System.out.println("The area of a square is "+(a*a));
	}
	
	public void getArea(int a, int b, int c) {
	    System.out.println("The area of a box is "+(a*b*c));
    }
	
	public void getArea(double a, double b) {
		System.out.println("The area of a cube is "+6*(a*b));
	}
}