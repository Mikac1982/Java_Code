package MethodsPractice;

public class JavaMethods1 {

	//Write a Java method to find the smallest number among three numbers.
	
	public static void main(String[] args) {
		
		JavaMethods1 obj=new JavaMethods1();
		
		System.out.println("The smallest number is "+obj.isSmallest(23, 13, 29));;
		System.out.println("The largest number is "+obj.isLargest(123, 93, 29));;
		
	}
	int isSmallest(int a, int b, int c) {
		int min=a;
		
		if (b<a){
			min=b;
		}else if(c<min) {
			min=c;
		}
	   return min;
	}
	
	int isLargest(int a, int b, int c) {
		int max=a;
		
		if (b<a){
			max=b;
		}else if(c<max) {
			max=c;
		}
	   return max;
	}
	
	
	
	
	
	
	
	
}
