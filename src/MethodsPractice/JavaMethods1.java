package MethodsPractice;

public class JavaMethods1 {

	//Write a Java method to find the smallest number among three numbers.
	
	public static void main(String[] args) {
		
		JavaMethods1 obj=new JavaMethods1();
		obj.isSmallest(25, 3, 29);
		
	}
	
	void isSmallest(int a, int b, int c) {
		
		if (a<b && a<c) {
			System.out.println("The smallest number is "+a);
		}else if (a<b && c<a) {
			System.out.println("The smallest number is "+c);
		}else if (b<a && b<c){
			System.out.println("The smallest number is "+b);
		}else if (b<a && c<b) {
			System.out.println("The smallest number is "+c);
		}else if (c<a && b<c) {
			System.out.println("The smallest number is "+b);
		}
	}
	
	
	
	
	
	
	
	
	
}
