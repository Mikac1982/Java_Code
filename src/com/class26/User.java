package com.class26;

public class User {
	
   //Write program: user class  has a constructor that takes name and mobile number.
   //Extend this class by userInfo that will have user address variable. 
   //Print users name, mobile number and address in userDetails method. Test your code.
	
	String name;
	int mobNumber;
	
	User(String name, int mobNumber){
	   this.name=name;
	   this.mobNumber=mobNumber;
	}
}
class UserInfo extends User{

	String userAddress;
	
	UserInfo(String name, int mobNumber, String userAddress ){
		super(name, mobNumber);
		this.userAddress=userAddress;
	}
	
	public void userDetails() {
		System.out.println("User name is "+name+", phone number is "+mobNumber+" and address is "+userAddress);
		
	}
	
	
}
