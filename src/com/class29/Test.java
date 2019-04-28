package com.class29;

public class Test {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
	driver.closeBrowser();
	driver.execute();
	driver.findElement();
	driver.m2();
	driver.maximizeWindow();
	driver.openBrowser();
	driver.takesScreenShot();
	
	TakesScreenshot.m1(); //static method accessing by using class name where method is defined
	System.out.println(TakesScreenshot.fileExtentsion);
	}
}
