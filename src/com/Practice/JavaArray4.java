package com.Practice;

public class JavaArray4 {
    public static void main(String[] args) {
		
    // Write a Java program to calculate the average value of array elements  	
    	
    int[] num= {2,10,30,5,6,1,8,15,44,33};
    double sum=0;
    double averageValue = 0;
    
    for (int i=0; i<num.length; i++)  {
    	sum+=num[i];
    	averageValue=sum/num.length;
    }
    System.out.println("The sum of array elements is "+sum);	
    System.out.println("The average value of array elemets is "+averageValue);	
    	
	}
}
