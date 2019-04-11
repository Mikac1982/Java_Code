package com.Practice;

import java.util.Scanner;

public class Zaki3 {
   public static void main(String[] args) {
	
	// Running the Race: Write a program that asks for:
    // the names of three runners and the time, in minutes, it took each of them to finish a race.
	// The program should display the names of the runners in the order that they finished.   
	   
	 String name1,name2,name3;
	 int time1,time2,time3;
	 String rank = null;
		 
	 Scanner scan=new Scanner(System.in); 
	 
	 System.out.println("Please enter the first name");   
	 name1=scan.nextLine();
	 System.out.println("Please enter the second name");  
	 name2=scan.nextLine();
	 System.out.println("Please enter the third name");  
	 name3=scan.nextLine();
	 System.out.println("Please enter the time of the 1st runner");
	 time1=scan.nextInt();  
	 System.out.println("Please enter the time of the 2nd runner");
	 time2=scan.nextInt();    
	 System.out.println("Please enter the time of the 3th runner");
	 time3=scan.nextInt(); 
	
	 if (time1<time2 && time2<time3) {
		 rank=name1+" "+name2+" "+name3;
	 }else if (time1<time2 && time3<time2) {
		 rank=name1+" "+name3+" "+name2;
	 }else if (time2<time1 && time1<time3) {
		rank=name2+" "+name1+" "+name3;
	 }else if(time2<time1 && time3<time1) {
		 rank=name2+" "+name3+" "+name1;
	 }else if (time3<time2 && time2<time1) {
		 rank=name3+" "+name2+" "+name1;
	 }else if (time3<time2 && time1<time2) {
		 rank=name3+" "+name1+" "+name2;
	 }
	 System.out.println(rank);
  
   }
}
