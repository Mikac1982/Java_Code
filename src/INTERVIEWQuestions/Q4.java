package INTERVIEWQuestions;

public class Q4 {
   public static void main(String[] args) {

	// How to find out the part of the string from a string?
	// What is substring? Find number of words in string?   
	   
	 String str="I am doing fine today";
	
	 String newStr=str.substring(5, 15);  
	 System.out.println(newStr);
	 
	 String str1="Just keep practicing every day";
	 
	 String[] array=str1.split(" ");
	 
	 for (String word:array) {
		 System.out.println(word);
	 }
	 System.out.println("Number of words in string is "+array.length);
	 
}
}
