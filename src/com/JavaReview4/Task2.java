package com.JavaReview4;

public class Task2 {
    public static void main(String[] args) {
		
    // write a program that prints the String "the time is 07:min and then all the mins till 7:30
    	
    // for loop
     for (int time=01; time<=30; time++)	{
    	 if (time<10) {
    	 System.out.println("the time is 07:0"+time);
     }else {
    	 System.out.println("the time is 07:"+time);
    	 }
     }
    	System.out.println();
    // while loop	
     int min=0;
     while (min<=30) {
    	 if (min<10) {
    	System.out.println("the time is 07:0"+min);
    	}else {
    		System.out.println("the time is 07:"+min);
    	}
    }
     System.out.println();
    
   // I DON'T KNOW HOW TO DO IT WITH DO WHILE :(
     int minn=00;
     do {
    	 if (min<10) {
    		 System.out.println("The time is 07;0"+min);
    	 }else {
    		 System.out.println("the time is 07"+min);
    	 }
    	 min++;
     }while (min<31);
	}
}
