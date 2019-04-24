package com.class27;

public class UserClass {
   
	 //Write program: user class  has a constructor that takes name and mobile number.
	 //Extend this class by userInfo that will have user address variable. 
	 //Print users name, mobile number and address in userDetails method. Test your code.
		
	public String name;
	public long mobNumber;
	
	//when you create own constructor, in child class you have to take care of it-compiler wont do it
	//in child class you have to call parent class constructor-using super(),we have to pass arguments in it
	public UserClass(String name, long mobNumber) {
	   this.name=name;
	   this.mobNumber=mobNumber;
	}
}
class UserInfo extends UserClass{
		
	public String address;
		
	public UserInfo(String name, long mobNumber, String address) {
		super(name, mobNumber);
		this.address=address;
		}
	public void userDetails() {
			System.out.println("User name is "+name+", phone number is "+mobNumber+" and address is "+address);
			
		}	
		
	}
	
	

