package com.class29Again;

public class ChromeDriver extends Browser implements WebDriver, Report{ //concrete class

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
	System.out.println("Maximazing chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find elements in chrome browser");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh chrome browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from chrome browser");
		
		
	}

	@Override
	public void takesScreenshot() {
		System.out.println("Taking screenshot in chrome browser");
		
	}

	@Override
	public void execute() {
		System.out.println("Executing code in chrome browser");
		
	}

	
	
	
}
