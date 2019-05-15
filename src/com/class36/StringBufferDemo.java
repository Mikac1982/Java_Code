package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//StringBuffer is mutable ->object can be changed
	//	StringBuffer sb=new StringBuffer("Hello");
		
	//	sb.deleteCharAt(3);
	//	System.out.println(sb); //Helo -no new object is getting created
		                        //
		
		String str="Good morning";
	//	new string object("Good morning John") is created but no one is taking reference, so it's destroyed
		str.concat("John");  //trying to add something; 	
	  //str=str.concat("John"); now we will see it cause there is reference assigned
		
		System.out.println(str);  //Good morning -object is not assigned so it's destroyed
		
		System.out.println("-------");
		
		StringBuffer sb=new StringBuffer("Good morning ");
		sb.append("John"); //same as concat(); method, just for StringBuffer -adding
		System.out.println(sb);  //Good morning John -> we can change it 
		
		//we can use StrinBuffer to reverse a String
		sb.reverse();
		System.out.println(sb); //nhoJ gninrom dooG
		
		System.out.println("-----------------");
		
		String str2="study";
		str2.concat("today");
		System.out.println(str2); //study
		
		str2=str2.concat("today");
		System.out.println(str2);  //studytoday
		
		StringBuffer sb2=new StringBuffer("study");
		sb2.append(" today");
		System.out.println(sb2);  //study today
	}
}
