package com.class15;

public class IQ2 {
   public static void main(String[] args) {
	
  //2.Write a java program to find the second largest number in the array?
  //  Maximum and minimum number in the array?  
	   
	 int arr[]= {144,-46,0,486,92,-1};     // ?????
	     
	 int largest=arr[0];    //144 starting with index 0=144
	 int min=arr[0];       
	 int secondLar=0;  
	 
	 for (int a:arr) {     
		 if (a>largest) {
			 largest=a;
		 }
		 if (a<min) {
			 min=a;
		 }
	 }
	 for (int a:arr)  {                     //
		 if (a>secondLar && a<largest) {
			 secondLar=a;
		 }
	 }
	 System.out.println("Second largest: "+secondLar);  
	 System.out.println("Largest: "+largest);    
	 System.out.println("Minimum: "+min);   
	   
	   
 }
}
