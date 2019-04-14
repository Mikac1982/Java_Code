package MethodsPractice;

public class JavaMethods6 {

	//Write a Java method to compute the sum of the digits in an integer
	//example: input an intiger:25
	//         expected output : the sum is 7
	
	public static void main(String[] args) {
		System.out.println("Sum of digits in intiger is "+sumOfDigits(358));
	}
	
	public static int sumOfDigits(int a) {
		int result=0;
		
		while (a>0) {       //???????????????/
			result=result+a%10;
			a/=10;
		}
		return result;
		
	}
	
	
	
	
}
