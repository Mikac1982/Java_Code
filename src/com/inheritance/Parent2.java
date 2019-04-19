package com.inheritance;

public class Parent2 {

	 Parent2() {
	        System.out.println("i am from Parent Class");
	    }

	    public static void main(String[] args) {
	        Parent2 p=new Parent2();
	        p.reverse("one", "two");
	    }
	    // This will reverse 1 parameter string
	    String reverse(String first) {
	        String reverse = "";
	        for (int i = first.length() - 1; i >= 0; i--) {
	            reverse = reverse + first.charAt(i);
	        }
	        return reverse;
	    }

	    String reverse(String first, String second) {
	        String reverse = "";
	        if (first.length() == second.length()) {
	            for (int i = first.length() - 1; i >= 0; i--) {
	                reverse = reverse + first.charAt(i) + second.charAt(i);
	            }

	        } else {
	            System.out.println("strings are not same length");
	        }

	        return reverse;
	    }

	
	
}
