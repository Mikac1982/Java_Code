package com.class32Again;
import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		//Upcasting 
		CreditCard visa=new Visa("Visa Platinum");	
		CreditCard ax=new AX("Ax Rewards");
		CreditCard mc=new MasterCard("MC basic");
		
		ArrayList<CreditCard> alist=new ArrayList<>(); //refereeing to SuperClass-we can access all subClass Objects
		alist.add(visa); //storing objects of different classes but same type-CreditCard
		alist.add(ax);
		alist.add(mc);
		
		//how I can get name of each card, and methods?
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
		//	card.interestRate();
		//	card.annualFee();
		}
		System.out.println("--------------");
		
		//how to print an interest rate of each card 
		Iterator<CreditCard> it=alist.iterator(); //
		while(it.hasNext()) {
			CreditCard obj=it.next();
			obj.interestRate();
		}
		System.out.println("--------------");
		
		//how to print an annual fee of each card
		for (int i=0; i<alist.size(); i++) {
			//alist.get(i).annualFee();
			CreditCard obj1=alist.get(i);
			obj1.annualFee();
		}
		
	}
}
