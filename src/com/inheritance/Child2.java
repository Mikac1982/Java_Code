package com.inheritance;

public class Child2 extends Parent2{

	
	Child2(){
//      for(int i=0;i<10;i++) {
//          System.out.println("I am from Child Class");
//      }
      //System.out.println("I am from Child Class");
    }
    public static void main(String[] args) {
      Child2 child=new Child2();
      //System.out.println(child.reverse("madam"));
    System.out.println(child.reverse("one", "two"));

  }
	
	
	
	
}
