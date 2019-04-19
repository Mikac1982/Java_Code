package com.class25;

public class SyntaxStudent extends Student{

  //  public boolean study() { NOT POSSIBLE
  //	System.out.println("Syntax Students must study HARD");
  //		return true;
  // }
	public void doHomework() {
		System.out.println("Syntax Students must do REPL");
	}
	public void attendClasse(String str,int num) {
		System.out.println("Syntax Students must attend ALL classes and take NOTES");
	}
	//creating child specific private method doResearch
	private void doResearch() {
		System.out.println("Syntax Students must make u");
	}
	
}
