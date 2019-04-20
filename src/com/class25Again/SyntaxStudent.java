package com.class25Again;

public class SyntaxStudent extends Student{

  //  public boolean study() {
	//	System.out.println("Syntax Students must study HARD");
	//	return true;
//	}
	
	public void doHomework() {
		System.out.println("Syntax Students must do REPL");
	}
	
	public void attendClasses(String str, int num) {
		System.out.println("Syntax Students must attend ALL classes and TAKE NOTES");
	}
	//creating child SPECIFIC private method doResearch
	private void doResearch() {
		System.out.println("Syntax Students must make uncle Google as best friend");
	}
	
	
	
}
