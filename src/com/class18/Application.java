package com.class18;

import com.class18_2.ScannerMethod;  //class ScannerMethod has to be PUBLIC to access it!

public class Application {

	public static void main(String[] args) {
		
//		ScannerMethod obj=new ScannerMethod();  //creating method for Scanner class in package 18_2
		                                        // accessing the Scanner Method class
//		System.out.println(obj.sum(125, 150));  // accessing the method inside that class (calling it)
		
		
		Application app=new Application();  //creating an object of this class
		
		System.out.println(app.example4("Mika"));
		System.out.println(app.example6('a'));
	}
	
	void example() {
		
		System.out.println("No return value and NO Parameters");
	}
	
    void example2(String name) {
		
		System.out.println("No return value but WITH Parameters: "+name);
	}
	
    boolean example3() {
		
		System.out.println("RETURN value and NO Parameters");
		return true;
	}
	
    String example4(String name) {
		
		System.out.println("RETURN value and WITH Parameters: "+name);
		return name;
	}
	
    boolean example5(String name) {
		
		System.out.println("RETURN value and WITH Parameters: "+name);
		return false;
	}
	
    char example6(char name) {
		
		System.out.println("RETURN value and WITH Parameters: "+name);
		return name;
	}
    
    double example7(char name) {   //this should give an error! but we see error during the run time!
		
		System.out.println("RETURN value and WITH Parameters: "+name);
		return name;
	}
    
    long example8(char name) {  //failer (error) happens during the run time
		
		System.out.println("RETURN value and WITH Parameters: "+name);
	//	name=1;  //now is ok
		return name;
	}
    
    
}
