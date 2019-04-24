package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("---Object of PARENT class");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("---Object of IPHONE class");
		Iphone iphone=new Iphone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("---Object of SAMSUNG class");
		Samsung samsung=new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		
		System.out.println("---Object of NOKIA class");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		nokia.cannotBreak();
		
		System.out.println("---Object of IPHONE class referring to the PARENT");
		//run time polymorphism
		Phone p=new Iphone();
		p.makeCall();
		p.hasCamera();
		
		System.out.println("---Object of NOKIA class referring to the PARENT");
		//run time polymorphism
		Phone p1=new Nokia();
		p1.makeCall();
        p1.hasCamera();
  	  //p1.cannotBreak();	ce: method is undefined	
		
        //creating a variable of a ParentType
        //using PARENT REFERENCE VARIABLE we can access all the methods in different child classes,
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
