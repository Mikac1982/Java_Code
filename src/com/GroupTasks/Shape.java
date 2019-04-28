package com.GroupTasks;

//Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimiter().
//Create 2 child classes: 
//Circle & Square that should have an implementation of area and perimeter calculation. 
//Test your code.

public interface Shape {

	void calculateArea();
	void calculatePerimeter();	
	
}
class Circle implements Shape {
    
    double r;
    
    Circle(double r) {
        this.r=r;
    }

    @Override
    public void calculateArea() {
        double area = 3.14*r*r;
        System.out.println(area);
        
    }

    @Override
    public void calculatePerimeter() {
        double per = 2* 3.14* r;
        System.out.println(per);
        }
    
}

class Square implements Shape {
    
    double a;
    Square(double a) {
        this.a=a;
    }

    @Override
    public void calculateArea() {
        double square = a*a;
        System.out.println(square);
        
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4*a;
        System.out.println(perimeter);
        
    }
    
    
    
}