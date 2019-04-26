package com.class27Again;

public abstract class Phone { //abstract class
        //in Parent class we provide common behaviors 
	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void unlockPhone(); 
	public abstract void viewPicters();
		
}
class iPhone extends Phone{ //CONCRETE CLASS-class that is inherited from abstract class or implemented by interface 
                            //and providing implementation of all unimplemented methods
	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone we can use FaceId or FingerPrint");
	}

	@Override
	public void viewPicters() {
		System.out.println("To view pictures on Iphone we can go to Images");
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we need to enter password");
	}

	@Override
	public void viewPicters() {
		System.out.println("To view pictures on samsung wehave to go to Gallery");
	}
	
	
	
}