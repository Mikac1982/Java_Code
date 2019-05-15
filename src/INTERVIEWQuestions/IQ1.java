package INTERVIEWQuestions;

public class IQ1 {
	 // Write a program to swap 2 numbers without a temporary variable?
	 // Swap 2 strings without a temporary variable?    
	
	public static void main(String[] args) {
		
	int a=10;
	int b=5;
	
	a=a+b;  //15
	b=a-b;  //10
	a=a-b;  //5
	
	System.out.println("After swap: a="+a);
	System.out.println("After swap: b="+b);
	
	
	//swap 2 Strings:
	
		String str1="Hello";
		String str2="Welcome";
		
		str1=str1+str2;  //HelloWelcome -12
		str2=str1.substring(0, str1.length()-str2.length());  //Hello
		str1=str1.substring(str2.length());	  //
	
	System.out.println("After swap String str1: "+str1);
	System.out.println("After swap String str2: "+str2);
	
	swapNum(100,50);
	}
	
	//write a method to swap 2 numbers
	public static void swapNum(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
//	System.out.println("After swap: a="+a+" and b="+b);	
	}	
		
	
		
		
		
		
		
	
}
