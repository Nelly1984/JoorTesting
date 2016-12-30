package com.joor.drivers;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	public Driver genericDriver;
	
	public void getDriver(String browserName)
	{
		switch(browserName){
//		case "ie":
//			genericDriver = new DriverIE();
//			break;
//		case "ff":
//			genericDriver = new DriverFF();
//			break;
		case "chrome":
			genericDriver = new DriverChrome();
			break;
		}
		genericDriver.instanceDriver();
	}
	
	public void tearDown()
	{
		genericDriver.freeDrive();
	}
	
	public WebDriver driver()
	{
		return genericDriver.driver();
	}
	
}
