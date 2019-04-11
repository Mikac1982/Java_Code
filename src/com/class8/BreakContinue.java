package com.class8;

public class BreakContinue {
   public static void main(String[] args) {
	
	for (int i=1; i<=10; i++)   {
		if (i==5) {       // at 5 it stops, exit the loop
			break;
		}
		System.out.println(i);
	}
	System.out.println();
	
	for (int g=0; g<=4; g++)   {
		System.out.println("Hello");
		break;            // loop terminate, it stops action!
	}
	
	
}
}
