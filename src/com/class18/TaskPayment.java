package com.class18;

import java.util.Scanner;

public class TaskPayment {
   public static void main(String[] args) {
	 // Ask user to enter the item they want to buy and the price for the item. 
	 // Then ask user to pay for it.
	 // Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
	 // Whenever user done with payments tell them "Thank you for shopping!"  
	   
	Scanner scan;
    String item;
    double price, payment, extraAm;
    double sum=0;
    
    scan=new Scanner(System.in);
    System.out.println("Please enter item you want to buy");
    item=scan.nextLine();
    System.out.println("Please enter the item price");
    price=scan.nextDouble();  //capturing price
    
    do {
    	System.out.println("Please enter your payment amount");
    	payment=scan.nextDouble();
    	sum=sum+payment;
    	if (sum<price) {
    	System.out.println("You have "+(price-sum)+" $ more to pay.");
    	}	
    	
    }while (sum<price);
	  
    	if (sum>price) {
    		extraAm=sum-price;
    		System.out.println("You have change "+extraAm+"$, thank you for shopping.");
    	}else {
    		System.out.println("Thank you for shoping.");
    	}
   
     }
}
