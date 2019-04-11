package com.class6;

import java.util.Scanner;

public class CountryLanguage {
  public static void main(String[] args) {
	 
	Scanner scan;
	String country, language;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch (country) {
	
	case "USA":
		language="English";
		break;
	case "Serbia":
		language="Serbian";
		break;
	case "Italy":
		language="Italian";
		break;
	case "Spain":
		language="Spanish";
		break;
	case "Japan":
		language="Japaniess";
		break;
	case "France":
		language="French";
		break;
	default:
	    language="Unknown";
	}
	 System.out.println("You speak "+language); 
 }
}
