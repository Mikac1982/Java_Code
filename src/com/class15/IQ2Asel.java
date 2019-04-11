package com.class15;

public class IQ2Asel {
  public static void main(String[] args) {
	
	  int arr[] = { -100, 942, 436, 1, -86, 292, 2 };
      
      int min = arr[0];     //0
      int secondLargest = 0;//0
      int largest =arr[0];      //0
      
      for(int a: arr) {
          if(a>largest) {
              largest =a;
          }
          if(a < min) {
              min = a;
          }
      }
      for(int a : arr) {
          if(a> secondLargest && a <largest) {
              secondLargest = a;
          }
      }
      System.out.println("Largest = "+ largest); 
      System.out.println("Second Largest ="+secondLargest);
      System.out.println("min= "+min);
     

         
	  
  }
}
