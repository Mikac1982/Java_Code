package com.class16;

public class Computer1 {

	String os, brand;                  // define(declaring) our VARIABLES (attributes, futures, states)!
	boolean mouse, keyboard;
	int screen, ram;
	
	
	public static void main(String[] args) {
		
		Computer1 comp1=new Computer1(); //creating an OBJECT of Computer class and declaring variable
		
		System.out.println("--------First Computer-----");
		
		comp1.os="Windows";
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.brand="HP";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		System.out.println("--------Second Computer--------");
		Computer1 comp2=new Computer1();
		
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.os="Mac OS";
		comp2.brand="Apple";
		
		comp2.watchMovie();      //methods, behaviors, actions
		comp2.doJavaCoding();
		comp2.playMusic();
	}	
	 // declaring our METHODS (behaviors)!
	void watchMovie() {        
		System.out.println("We can watch movie on a computer "+brand);  //Contaminating brand
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
	
	
	
}
