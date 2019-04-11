package com.class12;

public class StringManipulations3 {
   public static void main(String[] args) {
	
	 // charAt() --> returns a character at specific index 
	 String str="Students";
	 
//	 char character=str.charAt(4);
//	 System.out.println(character);   // e
	   
	 for (int i=0; i<str.length(); i++) {
		 System.out.print(str.charAt(i)+",");  // s,t,u,d,n,t,s
     }
	 System.out.println();
	 
	 // indexOf() --> returns an index of specified characters
	 System.out.println("-------- indexOf()-----------");
	 String str1="Sunday";
	 
	 int index=str1.indexOf("d");
	 System.out.println(index);    // 3
	 
	 String str2="Syntax Technologies";
	 
	 System.out.println(str2.indexOf("Syntax"));        // 0
	 System.out.println(str2.indexOf("Technologies"));  // 7
	 System.out.println(str2.indexOf(" "));             // 6
	 System.out.println(str2.indexOf("w"));             // -1 --> if doesn't find anything
	 
	 //substring() --> gives another string from your current string,specifying just beginning
	 System.out.println("-------- substring  -----------"); //from which index it will start, print
	 
	 String str3="Today is Sunday Java Class";
	 
	 String newString=str3.substring(5);
	 System.out.println(newString);       //is Sunday Java Class
	 
	 //gives another string with specifying beginning and end of index
	 System.out.println(str3.substring(9,20));   //Sunday Java
	 System.out.println(str3.substring(0,5));    //Today
	 System.out.println(str3.substring(16,20));  //Java
	 System.out.println(str3.substring(21));     //Class
	 
	 
	 
  }
}
