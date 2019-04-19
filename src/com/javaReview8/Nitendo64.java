package com.javaReview8;

public class Nitendo64 extends GameConsole {

	public static void main(String[] args) {
		
		Nitendo64 nintendo=new Nitendo64();
		nintendo.controller="red & blue";
		nintendo.numberOfController=4;
		nintendo.powerSource="outlet";
		nintendo.ifTvNeeded=true;
		nintendo.cd=false;
		//----------------belows are attributes----------------
		System.out.println(nintendo.controller+" Controler color");		
		System.out.println(nintendo.numberOfController+" number of controler");	
		System.out.println(nintendo.powerSource+" if tv is needed");	
		System.out.println(nintendo.ifTvNeeded+" is cd required");	
		System.out.println(nintendo.cd+" is power source needed");	
		
		//------------------below are behaviors----------------		
	//---System.out.println(nintendo.portable()+" is game system portable");
	//---System.out.println(nintendo.surfWeb()+" able to surf the web ");
	//---too old to play on web
	//	nintendo.readDisk();  //for void method we do not need println 
		//nitendo is casset player not disk
	//	System.out.println(nintendo.readDisk());		//this is false!
		
		nintendo.ableToPlay();
		System.out.println(nintendo.canPlayMarioGames()+" Can play mario games");
	}
	
	boolean canPlayMarioGames() {
		return true;
	}
	
	
	
	
	
	
	
	
	
}
