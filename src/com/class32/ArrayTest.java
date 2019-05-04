package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		
	String a="A";
	String b=new String("B");
			
	int[] intArray={10, 21, 34};	
	String[] stringArray= {"Hello","Bye"};
	
	//can we place Object into Array? YES, String is an Object
	
	Visa visa1=new Visa("Visa Platinum");
	Visa visa2=new Visa("Visa Platinum");
	Visa visa3=new Visa("Visa Platinum");
	
	AX ax1=new AX("AX Platinum");
	AX ax2=new AX("AX Platinum");
	AX ax3=new AX("AX Platinum");
	
	
	Visa[] visaArray= {visa1, visa2, visa3}; //storing objects inside array
	AX[] axArray= {ax1, ax2, ax3};
	
	CreditCard[] ccArray= {visa1, visa2, visa3, ax1, ax2, ax3};
	
	//this is array of objects
	//using Object type we can store any object class
	//autoboxing is happening automatically
	Object[] objectArray= {visa1, ax1, "John", 67, true, 90.09, 'c'}; //using Object type we can store any object class
	
	
	}
}
