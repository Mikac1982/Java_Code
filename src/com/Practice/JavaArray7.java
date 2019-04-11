package com.Practice;

public class JavaArray7 {
   public static void main(String[] args) {
	
	// Write a Java program to remove a specific element from an array   
	   
	   int arr[]= {1,2,3,4,6,8};
       int a=3;
       int arr1[]=new int[arr.length-1];
/*
       for(int i=0,j=0;i<arr.length;++i) {
           //here you looking for this number 3
           if(arr[i]!=a) {
               //if its not 3 you filling your second array
               arr1[j]=arr[i];
               //j its your second for loop for c array
               j=j+1;
           }
           }
        //and here you printing your new array without 3
        for(int i=0;i<arr.length-1;i++) {
        	System.out.print(arr1[i]+" ");
        }
       System.out.println();
   */    
       // the way i understand!
       
        for(int i=0;i<arr.length;++i) {
            if(arr[i]!=a) {
               for(int y=0; y<arr.length-1; y++) {
                   arr1[y]=arr[i];
               }   
                   System.out.print(arr[i]+" ");       
            } 
        }     
}
}
