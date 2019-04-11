package ReplTask;

public class Task69 {
   public static void main(String[] args) {
	
	//   Validate if the string ends with "u" prints the Boolean value accordingly
	//   Validate if the string ends with "world" prints the Boolean value accordingly
	//   Validate if the string ends with "are" prints the Boolean value accordingly
	//   Validate if the string ends with "you" prints the Boolean value accordingly   
	   
	 String s1="hello how are you";  
	 
	boolean stringEnds=s1.endsWith("u");
	System.out.println(s1.endsWith("u"));           // true
	 
	boolean stringEnds1=s1.endsWith("world") ;
	System.out.println(stringEnds1);          // false
	
	boolean stringEnds2=s1.endsWith("are") ;  
	System.out.println(stringEnds2);          // false
	
	boolean stringEnds3=s1.endsWith("you") ;
	System.out.println(stringEnds3);          // true
}
}
