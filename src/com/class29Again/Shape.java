package com.class29Again;

/*Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
 * Create 2 child classes: 
 * Circle & Square that should have an implementation of area and perimeter calculation. 
 * Test your code.
 */
public interface Shape {

	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape{
   
    double pi=3.14;
    int r;
    
    Circle(int r){
    	this.r=r;
    }
	public void calculateArea() {
		double area=pi*r*r;
		System.out.println("Area of a circle is: "+area);
	}
	public void calculatePerimiter() {
		double per=2*pi*r;
		System.out.println("Perimiter of a circle is: "+per);
	}
	
}
class Square implements Shape{
    int a;
    
    Square(int a){
    	this.a=a;
    }
	public void calculateArea() {
		double area=a*a;
		System.out.println("Area of a square is: "+area);
	}
	public void calculatePerimiter() {
		double per=4*a;
		System.out.println("Perimeter of a square is: "+per);
	}
	
	
}