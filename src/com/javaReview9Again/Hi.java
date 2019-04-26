package com.javaReview9Again;

public class Hi {

	Hi(){
		System.out.println("no parameter");
	}
	
	Hi(int a){
		System.out.println("I am a constructor with 1 parameter "+a);
	}
	
	Hi(int a, int b){
		this(1);
		System.out.println("I am a constructor with 2 parameters "+b);
	}
	
	Hi(String a, String b, String c){
		this(2,4);
		System.out.println("I am a constructor with 3 parameters "+c);
	}
	
	public static void main(String[] args) {
		Hi obj=new Hi("today", "is", "wednsday");
	}
}
