package com.class28;

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Opening firefox browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing fairfox browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing firefox windows");
	}

	@Override
	public void findElements() {
		System.out.println("Find elements in fairfox broeser");
	}
	
	
}