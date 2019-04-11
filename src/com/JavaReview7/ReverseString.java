package com.JavaReview7;

public class ReverseString {

	/* Create a String method called ReverseString
    *  Method return the string you hard coded in reverse order(This is the static way)
    *  Have the string you will create will say "seigolonhceT xatnyS"
	*/
	
	public static void main(String[] args) {
		
		ReverseString obj=new ReverseString();
		obj.ReverseString();
	}

void ReverseString() {
	
	String str="seigolonhceT xatnyS";
	String reverse="";
	
	for (int i=str.length()-1; i>=0; i--) {
		reverse+=str.charAt(i);	
	//	 System.out.println(reverse);
	}
   System.out.println(reverse);
}
}