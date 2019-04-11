package INTERVIEWQuestions;

public class Q2 {
   public static void main(String[] args) {
	
   // Write a java program to find the second largest number in the array?
   // Maximum and minimum number in the array?	    
	
   int[] arr= {203,7,319,18,1,434,54}; 
   
   int largest=arr[0];
   int secondLar=0;
   int min=arr[0];
    
   for (int a : arr) {
	   
	   if (a>largest) {
		  largest=a; 
	   }else if (a<min) {
		   min=a;
	   }
   }
   for (int a : arr) {
	   if (a>secondLar && a<largest) {
		   secondLar=a;
	   }
   }
	    
   System.out.println("Largest number is: "+largest);
   System.out.println("Minimum number is: "+min);
   System.out.println("Second largest number is: "+secondLar);   	   
 }
}
