package com.joor.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Driver {

	WebDriver driver;
	WebElement element;
	
	public Driver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openPage(String url)
	{
		driver.get(url);
	}
	
	public void sendKeys(String text, By xpath)
	{
		element = driver.findElement(xpath);
		element.sendKeys(text);
	}
	
	public void clickElement(By xpath)
	{
		element = driver.findElement(xpath);
		element.click();
	}
	
	public void sleep(int segundos) throws InterruptedException
	{
		Thread.sleep(segundos*1000);
	}

	public WebElement findElement(By id) {
		return element = driver.findElement(id);
		
	}
	public WebElement mouseHover(By xpath)
	{ 
	
		Actions builder = new Actions(driver);
		element = driver.findElement(xpath);	
		builder.moveToElement(element).perform();
		builder.moveToElement(element).click().perform();
		return null;
		
	}
	
	

	
}
