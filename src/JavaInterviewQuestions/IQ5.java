package JavaInterviewQuestions;

public class IQ5 {
	// Write a java program to reverse String? Reverse a string word by word? 
	
	public static void main(String[] args) {
		
	//1. using Reverse Function:
		
		String str="Hello Syntax students";
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		System.out.println();
		
	//2. without using reverse function	
		
	//a) using charAt();	
		String reversed="";
		
	for (int i=str.length()-1; i>=0; i--) {
		reversed+=str.charAt(i);
	}
	System.out.println(reversed);	
	
	//b) using toCharArray();
	String reversed1="";	
	char[] array=str.toCharArray();
	
	for (int i=str.length()-1; i>=0; i--) {
		reversed1+=array[i];
	}	
	System.out.println(reversed1);	
	
	//c) using substring();
	
	String reversed2="";
	
	for (int i=str.length(); i>0; i--) {
		reversed2+=str.substring(i-1, i);
	}
	System.out.println(reversed2);
	
	System.out.println();
	
	//Reverse a string word by word:
	String[] array2=str.split(" ");
	
	for (int i=array2.length-1; i>=0; i--) {
		System.out.println(array2[i]);
	}
	}
}
