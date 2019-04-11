package com.class6;

import java.util.Scanner;

public class LanguageSwitch {
	public static void main(String[] args) {
		
  // Ask user to enter their country and capture it.
  // Once values are captured print which language user speaks.
		
  Scanner scan;
  String country, language;	
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
	switch (country)	 {
	
	case "Serbia":
		language="Serbian";
		break;
	case "Italy":
		language="Italian";
		break;
	case "Spain":
		language="Spain";
		break;
	case "USA":
		language="English";
		break;
	case "Japan":
		language="Japaniess";
		break;
	case "Russia":
		language="Russian";
		break;
	default:
		language="Unlnown";
		break;
		
	 }
	System.out.println("You speak "+language);
				
	}

}
