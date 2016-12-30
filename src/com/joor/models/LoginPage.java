package com.joor.models;

import org.openqa.selenium.By;

import com.joor.driver.Driver;

public class LoginPage {

private Driver driver;
	
	private By btnUserLoginLocator;
	private By userLocator;
	private By passLocator;
	private By btnSignInLocator;
	private By linkLogoutLocator;
	
	public LoginPage (Driver driver)
	{
		this.driver = driver;
		
		btnUserLoginLocator = By.cssSelector(".login-button");
		userLocator = By.cssSelector("#login-name");
		passLocator = By.cssSelector(".login-input.login-pw.center");
		btnSignInLocator = By.cssSelector(".gold-button.center.sign-in");
		linkLogoutLocator = By.xpath(".//*[@id='nav-account-dropdown']/li[6]/a");
	}
	
	public void launch()
	{
		driver.openPage("https://staging.joordev.com/");
	}
	
	public void clickIconLogin()
	{
		driver.clickElement(btnUserLoginLocator);
	}

	public void enterUser(String user)
	{
		driver.sendKeys(user, userLocator);

	}
	
	public void enterPassword(String pass)
	{
		driver.sendKeys(pass, passLocator);
	}
	
	
	public void clickBtnSignIn()
	{
		driver.clickElement(btnSignInLocator);
	}
	
	public void clickLinkLogout()
	{
		driver.clickElement(linkLogoutLocator);
	}
	public void sleep(int segundos)throws InterruptedException
	{
		driver.sleep(segundos);
	}
}
