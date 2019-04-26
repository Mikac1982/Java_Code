package com.JavaReview9;

public class ThisKeyword {

	String string;  //instance variables are blue(global)
	int Int;
	
	ThisKeyword(String a, String b){
		//passing the argument true
		this(true); //looking for constructor with 1 parameters
		System.out.println("this is single parameter constructor "+a+" "+b);
	}
	ThisKeyword(boolean a){
		System.out.println("this is single parameter constructor "+a); //first to execute
	}
	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword("a","b"); //calling constructor with 2 string parameters-line 8 jumps to 12
		}
	
	void firstMethod(String string, int Int) { //local variable are braon color
		this.string=string;
	}
	
	void secondMethos() {
		this.firstMethod("Hello",1);
	}
	
	
}
