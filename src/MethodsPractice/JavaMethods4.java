package MethodsPractice;

public class JavaMethods4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Number of a vowels in a string is "+countVowels("Apples are good")); //6
		System.out.println("Vowels in a strin are: "+printAllVowels("Apples are good"));  //Aeaeoo
	}
	
	//Write a Java method to count all vowels in a string
	public static int countVowels(String str) {
		
		String replaced=str.replaceAll("[^aeiouAEIOU]","");
		return replaced.length();
		
	}
	
	//Write a Java method to print all the vowels in a string.
	public static String printAllVowels(String str) {
		
		String vowels=str.replaceAll("[^aAeEiIoOuU]", "");
		
		return vowels;
	}
	
	
	
	
}
