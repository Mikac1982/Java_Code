package com.class16;

public class Computer {

	    String os;
	    boolean mouse, keyboard;
	    int screen, ram;
	    
	  public static void main(String[] args) {
	    
	    Computer comp1=new Computer();  //we created a new object of the class Computer
	    
	    comp1.mouse=true;
	    comp1.keyboard=true;
	    comp1.screen=2;
	    comp1.ram=8;
	    comp1.os="Windows";
	    
	    Computer comp2=new Computer();
	    
	    comp2.mouse=false;
	    comp2.keyboard=false;
	    comp2.screen=4;
	    comp2.ram=6;
	    comp2.os="Mac OS";
	
	
	  }
	
}
