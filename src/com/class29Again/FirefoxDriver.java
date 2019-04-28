package com.class29Again;

public class FirefoxDriver extends Browser implements WebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening firefox browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing firefox browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximazing firefox browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find elements in firefox browser");
		
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh firefox browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from firefox");
		
	}

	@Override
	public void takesScreenshot() {
	System.out.println("Taking screenshot in firefox browser");
		
	}

	@Override
	public void execute() {
		System.out.println("Executing code in firefox browser");
		
	}

	
	
	
	
	
}
