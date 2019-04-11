package com.class19;

public class Aplications {


	public static void main(String[] args) {
		
		Animals dog=new Animals();
		
		dog.breed="Husky";
		dog.weigth=5;
		dog.age=2;
		dog.name="Ricky";
		
		dog.canBark();
		dog.isWild();
		
		Animals dog1=new Animals();
		
		dog1.breed="Buldog";
		dog1.weigth=3;
		dog1.age=1;
		dog1.name="Medo";
		
		dog1.canBark();
		dog1.isWild();
		
        Animals dog2=new Animals();
		
		dog2.breed="Unknown";
		dog2.weigth=15;
		dog2.age=4;
		dog2.name="Dogy";
	
		dog2.canBark();
		dog2.isWild();
	}	
}
