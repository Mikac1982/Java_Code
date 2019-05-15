package JavaInterviewQuestions;

public class IQ4 {
	// How to find out the part of the string from a string?
	// What is substring? Find number of words in string? 
	
	public static void main(String[] args) {
		
	String str="Welcome to the interview sessions with Syntax";	
	//1.
	System.out.println(str.substring(34));     //with Syntax
	System.out.println(str.substring(8, 33));  //to the interview sessions
		
	System.out.println();
	
	//2. Find number of words in string:
	String[] array=str.split(" ");  //getting an array of String using method split();
	
	for (String word : array) {
		System.out.println(word);
	}
	System.out.println("Number of words in a String: "+array.length);	
	
	//second way of looping to get all the words
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	
	}
}
