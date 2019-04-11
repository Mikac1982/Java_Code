package com.class5;

import java.util.Scanner;

public class HeightsAnd {
	public static void main(String[] args) {
     // Ask the user to enter person heights in inches
     // Person should be classified as one of these;
	    //  short (under5 feet)
		//  medium (5 to 6 feet)
		//  tall (6 feet and over)
		
		double height;
        // int height;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height");
		height =input.nextDouble();
		
		if (height <5) {
			System.out.println("Short");

		} else if (height >=5 && height <6) {     // && = AND;
			System.out.println("Medium");
		} else {
			System.out.println("Tall");
		}


	}

}
