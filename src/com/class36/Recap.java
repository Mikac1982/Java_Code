package com.class36;

public class Recap {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}finally {
			System.out.println("Some clean up code");
		}
		
		System.out.println("End of code...");
		
		
		
		

		
		
	}
}
