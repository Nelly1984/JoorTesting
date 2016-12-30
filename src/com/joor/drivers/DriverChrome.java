package com.joor.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome  extends Driver{

	@Override
	public WebDriver instanceDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Users/Nelly/Documents/Automation/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	@Override
	public WebDriver instanceRemoteDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver driver() {
		// TODO Auto-generated method stub
		return driver;
	}

	@Override
	public void freeDrive() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
