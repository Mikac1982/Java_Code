package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		
	Visa visa=new Visa("Visa Platinum");	
//	CreditCard visa=new Visa("Visa Platinum");	
	AX ax=new AX("AX Rewards");	
		
	MasterCard mc=new MasterCard("MC basic");	
		
	
	ArrayList<CreditCard> alist=new ArrayList<>(); //store Parent class
	alist.add(visa);
	alist.add(ax);
	alist.add(mc);
	
	//how i can get name of each card
	for (CreditCard card:alist)	{
		System.out.println(card.creditCardName);
	//	card.interestRate();
	//	card.anualFee();
	System.out.println("----------");
	}
	//how we can print an interest rate of each card	
	Iterator<CreditCard> it=alist.iterator();
	while(it.hasNext()) {
		CreditCard obj=it.next();
		obj.interestRate();
	}
	System.out.println("----------");	
	//how to print an annual fee of each card
	for (int i=0; i<alist.size(); i++) {
		CreditCard obj1=alist.get(i);
		obj1.anualFee();
	}
	
	
	
	
	
	
	
	
	
	
	}
}
