package com.class9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
		
   // Print the following pattern:
   //    *
   //    **
   //    ***
   //    ****
   //    *****
   //    ****
   //    ***
   //    **
   //    *
    	
    for (int i=1; i<=5; i++) {
    	for (int y=1; y<=i; y++) {
    		System.out.print("*");
    		}
    	System.out.println();
    	}
    
    for (int i=1; i<=4; i++) {
    	for (int y=4; y>=i; y--) {
    		System.out.print("*");
    		}
    	System.out.println();
        }
	}
}
