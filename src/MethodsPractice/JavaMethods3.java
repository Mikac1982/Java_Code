package MethodsPractice;

public class JavaMethods3 {

	//Write a Java method to display the middle character of a string
	// a) If the length of the string is odd there will be two middle characters.
	// b) If the length of the string is even there will be one middle character.
	
	public static void main(String[] args) {
		
		JavaMethods3 obj=new JavaMethods3();
		obj.middleChar("Beautifuls");
			
	}
	
	void middleChar(String str) {
			
	int length=str.length();  
		
	   if (length%2==0) {
		   System.out.println(str.charAt(length/2-1)+""+str.charAt(length/2));
	   }else if (length%2!=0) {
		   System.out.println(str.charAt(length/2));
	   }
	
	}
	
}
