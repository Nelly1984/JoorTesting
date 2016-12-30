package com.joor.drivers;

import org.openqa.selenium.WebDriver;

public abstract class Driver {
	protected WebDriver driver;
	public abstract WebDriver instanceDriver();
	public abstract WebDriver instanceRemoteDriver();
	public abstract WebDriver driver();
	public abstract void freeDrive();
	

}
