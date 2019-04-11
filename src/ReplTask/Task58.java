package ReplTask;

import java.util.Scanner;

public class Task58 {
   public static void main(String[] args) {
	
  // Create an int array with the size of 5 and input values with Scanner.
  // Print out each element of the array multiplied by ten, one element per line.
  // Create a loop and enter values into one loop, the second loop print the values and it must be multiplied by 10.
 
	int[] number=new int[5];
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter values:");
	
	for (int i=0; i<number.length; i++)  {
		number[i]=scan.nextInt();
	}
	System.out.println("Values multiplied by 10:");
	for (int y=0; y<number.length; y++) {
		System.out.println(number[y]*10);
	}
	   
}
}
