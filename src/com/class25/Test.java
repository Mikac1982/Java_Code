package com.class25;

public class Test {
	public static void main(String[] args) {
		
		Student stu=new SyntaxStudent();
		stu.study();
		stu.doHomework();
		stu.attendClasse("Hello",5);
	//	stu.doResearch(); not avaiable! PRIVATE METHODS(members) NEVER GET INHERITED
		
	}

}
