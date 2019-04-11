package INTERVIEWQuestions;

public class Q1 {
   public static void main(String[] args) {
	
	 // Write a program to swap 2 numbers without a temporary variable?
	 // Swap 2 strings without a temporary variable?    
	   
	int a=20; 
	int b=10;
	
	a=a-b;  //10
	b=a+b;  //10+10=20
	a=b-a;  //20-10=10
	
	System.out.println("After swap: value of a="+a+",value of b="+b);
	System.out.println();
	
	// Strings
	String str1="Hello";   //5
	String str2="World";   //5
	
	str1=str1+str2;//HelloWorld-->10
	str2=str1.substring(0, str1.length()-str2.length());//Hello
	str1=str1.substring(str2.length());
	
	System.out.println("The value of str1="+str1);
	System.out.println("The value of str2="+str2);
	System.out.println();
	
	// with replaceAll();
	String s1="Good";
	String s2="Morning";
	
	s1=s1+s2;      //GoodMorning
	s2=s1.replaceAll(s2, "");  //Good
	s1=s1.replaceAll(s2, "");
	
	System.out.println("The value of s1="+s1);
	System.out.println("The value of s2="+s2);
}
}
