package com.homework;

import java.util.Scanner;

public class LogOper65 {
public static void main(String[] args) {
	//Take 2 boolean inputs from a user:
	//	"Are you thirsty?"
	//	"Are you sleepy?
	//	If user is thirsty and not sleepy--> drink=Water
	//	If user is thirsty and sleepy--> drink=Coffee
	//	If user is not thirsty and sleepy --> drink=Tea
	//	Otherwise drink="Nothing"
	//	The output should be:   "Looks like you need ___ "
	
	Scanner scan; 
	boolean thirsty=true; 
	boolean sleepy=true;
	String drink;
	
	scan=new Scanner(System.in);
	System.out.println("Are you thirsty?");
	thirsty=scan.nextBoolean();
	System.out.println("Are you sleepy?");
	sleepy=scan.hasNextBoolean();
	
	if ((sleepy) && (thirsty)){
		drink="Coffee";
	}else if ((thirsty)&&(!sleepy)){
		drink="Water";
	}else if ((!thirsty) && (sleepy)) {
		drink="Tea";
	}else {
		drink="Nothing";
	}
	
	System.out.println("Looks like you need "+drink);
 }
}
