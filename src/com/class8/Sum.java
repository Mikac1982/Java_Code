package com.class8;

public class Sum {
	public static void main(String[] args) {

	 int sum =0;

     for (int i=1; i<=5; i++)   {

		sum=sum+i; 
      }
	 System.out.println(sum);  //15
	 

		// find sum of all even numbers from 1 to 1oo

		int sum1 = 0;

		for (int i=1; i<=100; i++) {
           if(i%2==0) {
			sum1 = sum1 + i;
		}
		}
		System.out.println(sum1);  //2550

		int sumAll=0;
		
		for (int y=10; y<=50; y+=10) {
			sumAll=sumAll+y;
		}
		System.out.println(sumAll);  // 150
	}
}
