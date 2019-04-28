package com.class29;

public interface WebDriver extends TakesScreenshot, Executes{

	void openBrowser();
	void closeBrowser();
	public void maximizeWindow();
	void findElement();
	
}