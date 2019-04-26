package com.class28;

//Create a WebDriver Interface that will have the following unimplemented behaviour:
//openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
	System.out.println("Chrome can open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize windows");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome can find elements");
		
	}
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox can close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox drivercan maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("Firefox can find elements");
	}
	
	
}