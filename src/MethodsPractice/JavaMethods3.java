package MethodsPractice;

public class JavaMethods3 {

	//Write a Java method to display the middle character of a string
	// a) If the length of the string is odd there will be two middle characters.
	// b) If the length of the string is even there will be one middle character.
	
	public static void main(String[] args) {
		
		JavaMethods3 obj=new JavaMethods3();
		obj.middleChar();
		
		
	}
	
	void middleChar() {
			
	String str="Saturday";
	int size=str.length();  //8
		
	   int length = 0;
	   int position = 0;
	   
	   if (size%2==0) {
		   position=size/2-1;
		   length=2;
	   }else if (size%2!=0) {
		   position=size/2;
		   length=1;
		  
	   }
	   System.out.println(str.substring(position, position+length));
	
	
	
	}
	
}
