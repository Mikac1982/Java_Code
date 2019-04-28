package com.JavaReview9;

/* I want you to create two classes one called MainInherintence and ChildInherintence
     * in your main class i want you to create 1 method to swap numbers, and another to swap strings
     * and in your child i want you to extend main, and i want you to create the same methods, and parameters, but in the block of code
     * i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String
     */

public class MainInheritance {

	public void swapNum(int a, int b) {

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Int a="+a+" and int b="+b);
	}
    public void swapString(String a, String b) {
    	a=a+b;
        b=a.replaceAll(b,"");
        a=a.replaceAll(b, "");
		System.out.println("String a="+a+" and String b="+b);
		
		//a=a+b; //HelloWorld =10
		//b=a.substring(0, a.length()-b.length()); //10-5=5; Hello
	    //a=a.substring(b.length());
		//System.out.println(a+" "+b);
	}
    public static void main(String[] args) {
    	
    	ChildInherintence obj=new ChildInherintence();
        obj.swapNum(10, 20);
    	obj.swapString("Hello", "Bye");
    	obj.swapNum();
    	obj.swapString();
	}
}
class ChildInherintence extends MainInheritance{
	
   public void swapNum() {
		System.out.println("not reversing");
	}
    public void swapString() {
		System.out.println("not reversing");
	}
	
}