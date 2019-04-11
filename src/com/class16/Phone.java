package com.class16;

public class Phone {

    // Create a Class “Phone”.
    //Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviours.
	
	String model, color, os;
	int screen,size ;
	
	public static void main(String[] args) {
			
	Phone phone1=new Phone();
	
	phone1.model="Iphone";
	phone1.color="Silver";
	phone1.screen=5;
	phone1.os="IOS";
	phone1.size=7;
	
	phone1.makeCalls();
	phone1.searchWeb();
	phone1.playGames();
	
	Phone phone2=new Phone();
	
	phone2.model="Android";
	phone2.color="Black";
	phone2.screen=6;
	phone2.os="Windows";
	phone2.size=8;
	
	Phone phone3=new Phone();
	
	phone3.model="Nokia";
	phone3.color="Red";
	phone3.screen=4;
	phone3.os="Windows";
	phone3.size=6;
	
	phone2.makeCalls();
	phone2.searchWeb();
	phone2.playGames();
	
	}
	void makeCalls() {
		System.out.println("We can make calls on "+model);
	}
	void searchWeb() {
		System.out.println("We can search web on "+model);
	}
	void playGames() {
		System.out.println("We can play games on "+model);
	}
}
