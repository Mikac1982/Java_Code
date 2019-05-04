package com.class32Again;

public class ArrayTest {

	public static void main(String[] args) {
		
		String a="A";
		String b=new String("B"); //String is an Object
		
		int[] intArray= {10,20,30};
		String[] stringArray= {"Hello", "Bye"};
		
		//Can we place Object into Array? YES! String is an Object
		
		Visa visa1=new Visa("Visa Platinum");
		Visa visa2=new Visa("Visa Platinum");
		Visa visa3=new Visa("Visa Platinum");
		
		Visa[] visaArray= {visa1, visa2, visa3}; //YES! storing Visa Objects inside Array
		
		AX ax1=new AX("Visa Platinum");
		AX ax2=new AX("Visa Platinum");
		AX ax3=new AX("Visa Platinum");
		
	    //storing homogeneous and heterogeneous(belongs to different classes) values by referring to Parent Class
		CreditCard[] ccArray= {visa1, visa2, visa3, ax1, ax2, ax3};
		
		//this is an Array of Objects!
		//Autoboxing is happening automatically-compiler do it
		Object[] objectArray= {"John", visa1, ax3, 44, 50.9, 'c', true}; //storing all types of Objects inside Array
		
		
	}
}
