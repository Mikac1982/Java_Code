package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("---OBJECT OF PARENT CLASS");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("---OBJECT OF IPHONE CLASS");
		Iphone iphone=new Iphone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("---OBJECT OF SAMSUNG CLASS");
		Samsung samsung=new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		
		System.out.println("---OBJECT OF NOKIA CLASS");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		
		System.out.println("---OBJECT OF IPHONE CLASS referring to the PARENT");
		Phone p=new Iphone();
		p.makeCall();
		p.hasCamera();
		
		System.out.println("---OBJECT OF NOKIA CLASS referring to the PARENT");
		Phone p1=new Nokia();
		p1.makeCall();
        p1.hasCamera();
  	   //p1.cannotBreak();	ce: method is undefined	
		
        //creating a variable of a ParentType
        //using PARENT REFERENCE VARIABLE we can access all the methods in different  child class,
        //but during run time JVM will decide which methods will execute
		Phone parentPhone;
		
		//assigning iphone object
		parentPhone=new Iphone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning samsung object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning nokia object
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
	}
	
	
	
}
