package com.javaReview9Again;

public class Childinheritance extends MainInheritance{
	@Override
   public void swapNum(int a, int b) { //method overriding
  	System.out.println(a);
  	System.out.println(b);
   }
	
  //  public void swapWords(String a, String b) {  //method overriding
  //	System.out.println(a+" "+b);
  //  }
    
    //----------above is from child method overriding------------------
  //  @Override --> error-you can not override what does not exist in Parent class
    void parentNum(int a, int b) {
    	super.swapNum(a, b);
    }
    
    void parentString(String a, String b) {
    	super.swapWords(a, b);
    }
    
    public static void main(String[] args) {
		Childinheritance obj=new Childinheritance();
		obj.parentNum(5, 10);
    	obj.parentString("Hello", "World");
    }
    
}
