package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void unlockPhone();  //unknown behavior-make it abstract 
	public abstract void viewPictures(); //abstract methods
}
class iPhone extends Phone{ //CONCRETE CLASS-is class that is inherited from a abstract class or 
	//implemented by interface and providing implementation of all unimplemented methods

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on iPhone you can go to Images");
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Sumsung we need to enter password");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures we have to go to gallery");
	}
	
	
	
}