package com.JavaReview4;

public class Time {
   public static void main(String[] args) {
	   
	 // for loop
	   for (int i = 0; i <= 30; i++) {
           if (i < 10) {
               System.out.println("The time is 7:0" + i);

           } else {
               System.out.println("The time is 7:" + i);
           }
        }
	   
     // while loop
       int min = 0;
       while (min <= 30) {
           if (min < 10) {
               System.out.println("The time is 7:0" + min);

           } else {
               System.out.println("The time is 7:" + min);
          }
       min++;
      }
       
       //do while
       int a=0;
       do {
    	   if (a<10) {
    		   System.out.println("the time is 07:0"+a);
    	   }else {
    		   System.out.println("the time is 07:"+a);
    	   }
    	   a++;
       } while (a<=30);
       
       
}
}
