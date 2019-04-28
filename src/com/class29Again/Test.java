package com.class29Again;

public class Test {

	public static void main(String[] args) {
		
	WebDriver obj=new ChromeDriver();
	obj.closeBrowser();
	obj.execute();
	obj.findElement();
	obj.m2();
	obj.maximizeWindow();
	obj.openBrowser();
	obj.takesScreenshot();
	TakesScreenshot.m1(); //access static method in static way by using class name where method is defined
	
	//access static variable in static way using class name where variable is defined
	System.out.println(TakesScreenshot.fileExtension);  //.png
	
	
	}	
}
