package ReplTask;

import java.util.Scanner;

public class Task59 {
   public static void main(String[] args) {
	
	// Create Scanner class
    // Write an array with size of 5. Use a loop to input values to the array.
	// Then print out all the elements you have created in the first loop in reverse order. 

   Scanner scan=new Scanner(System.in);
   System.out.println("Please enter values to the array");
   int[] num=new int[5];
   
	for (int i =0; i<num.length; i++)   {
		num[i]=scan.nextInt();
	}
	for (int y=num.length-1; y>=0; y--)   {
		System.out.println(num[y]);
	}
	   
	   
}
}
