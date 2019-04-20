package com.SuperAndThis;

public class Constructor {

	Constructor(){
		System.out.println("Super class constructor");
	}
}

class Childs extends Constructor {
	
	Childs(){
		super();
		System.out.println("Child class constructor");
	}
}
