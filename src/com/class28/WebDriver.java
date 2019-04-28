package com.class28;

//Create a WebDriver Interface that will have the following unimplemented behaviour:
//openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	public void maximizeWindow();
	void findElements();
	
}
class ChromeDriver implements WebDriver{ //CONCRETE CLASS
	
	@Override
	public void openBrowser() {
	System.out.println("Opening chrome browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing chrome windows");
	}

	@Override
	public void findElements() {
		System.out.println("Find elements in chrome browser");
		
	}
}
