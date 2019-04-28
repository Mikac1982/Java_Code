package com.class29Again;

public interface WebDriver extends TakesScreenshot, Executes{

	void openBrowser();
	void closeBrowser();
	public void maximizeWindow();
	void findElement();
	
}
