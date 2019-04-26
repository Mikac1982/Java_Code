package com.class27Again;

public class PhoneTest {

	public static void main(String[] args) {
		
	//	Phone obj=new Phone(); //can not create object (instantiate Phone class) of abstract class!
		
	Phone phone1=new iPhone();
	phone1.makeCall();
	phone1.sendText();
	phone1.unlockPhone();  //accessing unimplemented method from parent class
	phone1.viewPicters(); //accessing unimplemented method from parent class
		
	Phone phone2=new Samsung();
	phone2.makeCall();
	phone2.sendText();
	phone2.unlockPhone();  //accessing unimplemented method from parent class
	phone2.viewPicters();  //accessing unimplemented method from parent class
		
	}
	
	
	
	
	
}
