package MethodsPractice;

public class JavaMethods5 {

	public static void main(String[] args) {
		
		JavaMethods5 obj=new JavaMethods5();
		

		String[] array=obj.numOfWordsInString("The quick brown fox jumps over the lazy dog");
		
		for (String word:array) {
			System.out.println(word);
		}
		System.out.println("Number of words in string is: "+array.length);
	}
	
	
	//Write a Java method to count all words in a string.
	
	public String[] numOfWordsInString(String str) {
		
		String[] words=str.split(" ");
		return words;
	}
	
	
	
}
