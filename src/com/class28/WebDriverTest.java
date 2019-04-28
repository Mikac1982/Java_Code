package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElements();
		
		WebDriver obj2=new FirefoxDriver();
		obj2.openBrowser();
		obj2.closeBrowser();
		obj2.maximizeWindow();
		obj2.findElements();
		
		
	}
	
	
	
}
