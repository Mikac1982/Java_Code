package INTERVIEWQuestions;

public class Q5 {
   public static void main(String[] args) {
	
 //5. Write a java program to reverse String? Reverse a string word by word?      
	
	String str="My cat is going crazy";
	
	String reverse="";
	
	  // charAt();
	for (int i=str.length()-1; i>=0; i--) {
		reverse+=str.charAt(i);
	}
	System.out.println("Reverse string: "+reverse);
	System.out.println();
		
	// reverse string WORD BY WORD
	String[] arr=str.split(" ");
	
	for (int i=arr.length-1; i>=0; i--) {
	    System.out.println(arr[i]);
	}
	
	   
}
}
