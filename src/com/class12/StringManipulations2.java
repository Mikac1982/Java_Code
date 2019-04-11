package com.class12;

public class StringManipulations2 {
    public static void main(String[] args) {
	
    // contains() --> checks for specific values in the string
    // if value is present --> TRUE, else-->FALSE	
    	
    String str="Good morning, students!";
    boolean contains=str.contains("students");  // if the part of the string is there
    System.out.println(contains);    //true
    	
    String present="Welcome, Milena";
    String neededValue="WELCOME,";
    
    boolean flag=present.contains(neededValue);
    System.out.println(flag);    // false

    boolean flag1=present.toUpperCase().contains(neededValue);	// because now it is "WELCOME,"--> TRUE
    System.out.println(flag1);	  // true
    	
    //startsWith(), endsWith()--> will return TRUE if string starts/ends with specific value
    //                            else --> FAlSE            
    System.out.println("-----StartWith & EndWith-------");
    
    String str1="syntax";
    
    boolean starts=str1.startsWith("s");  //true
    System.out.println(starts);
    
    boolean ends=str1.endsWith("y");  //false
    System.out.println(ends);
    
    // isEmpty() if length of a string is =0--> string is EMPTY, else--> it's not empty
    System.out.println("---------isEmpty----------");
    
    String str2="Hello";
    boolean isEmpty=str2.isEmpty();   // false
    System.out.println(isEmpty);
    
    // concat()--> will concatenate(add) 1 string to the end of another
    System.out.println("--------concat()--------");
    
    String str3="Hello ";
    String str4="Ali";
    
    System.out.println(str3+str4);            // Hello Ali
    System.out.println(str3.concat(str4));    // Hello Ali
    
    // trim() --> will remove SPACE at the beginning and at the end of you string
    System.out.println("--------___-----------");
    
    String expected="You may qualify for a multi-policy discount";
    String actual=" You may qualify for a multi-policy discount ";
    
    // System.out.println(expected.equals(actual));  //false (because there is 2 spaces)
    
    actual=actual.trim();   // trim/cut spaces at the beginning and end
    System.out.println(expected.equals(actual));   // true
    
    
    
    
    
	}
}
