package com.javaReview8;

public class Task2 {

	/*
       Task: Create a boolean method that takes 2 boolean parameters of boolean
       (true,true) print false
       (false,true) print true
       (true,false) print false
       (false,false) print true 
	 */
	
	
	static boolean display(boolean a, boolean b)	{
		boolean flag=false;
	
		if (a==true && b==true) {
			flag=false;
		}else if (a==false && b==true) {
			flag=true;
		}else if (a==true && b==false) {
			flag=false;
		}else if (a==false && b==false) {
			flag=true;
		}
		
		return flag;
	}
		
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
	//	System.out.println(obj.display(true, false));
		System.out.println(display(false, false));
	}
	
	
	
}
