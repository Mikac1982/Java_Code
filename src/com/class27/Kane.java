package com.class27;

public class Kane extends Wrestler{

	@Override                    //you have to add abstract methods from wrestler class and give implementation
	public void themeMusic() {
		System.out.println("Stone Cols' intro music");
		
	}

	@Override
	public void finisher() {
		System.out.println("Stone Cold stunner");
		
	}

	
	
}
