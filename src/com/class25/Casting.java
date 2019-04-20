package com.class25;

public class Casting {

	public static void main(String[] args) {
		
		//IMPLICITE/Automatic casting/Widening/UpCasting --compiler takes care of conversion
		double a=10;  //
		System.out.println(a); //10.0
		
	//	int b=10.0;  cannot put double in smaller integer box
		//EXPLICIT/Manual/Narrowing--programmer takes care of conversion
		double b=10.0;
		int c=(int)(b);
		System.out.println(c);  //10
		
		int i=130;
	//	byte by=130;  compiler wont allow; byte=-127 to +128
		
		byte by=(byte)(i); //we converted it manually
		System.out.println(by); //-126
		
		//TYPE CASTING FOR OBJECTS
		//UPCasting-->compiler takes care of conversion
		Payment pay=new MasterCard();
		
	//	MasterCard mc=new Payment(); --> compiler won't allow you /can't put parent class to child class
		
		//DOWNcasting-we have to do it manually 
		MasterCard mc=(MasterCard)new Payment();
	//or MasterCard mc1=(MasterCard)pay;
		
		
	}
	
	
	
	
	
}
