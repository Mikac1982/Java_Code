package com.class14;

public class StringManipulations1 {
    public static void main(String[] args) {
		
    // toCharArray() - converts string to an array of character
    //               - into individual characters
    	
    String str="saturday";
    
    char[] array=str.toCharArray(); // first we create an array of char
    
    System.out.println("-------For Loop--------");
    
    for (int i=0; i<array.length; i++) {
    	System.out.println(array[i]);
    }
    System.out.println("-----For Each Loop-----");
    
    for (char c:array) {
    	System.out.println(c);
    }
    System.out.println("Printing in reverse");
    for (int i=array.length-1; i>=0; i--) {
    	System.out.println(array[i]);
    }
    	
 }
}
