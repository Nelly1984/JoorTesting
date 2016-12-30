package com.joor.models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.joor.driver.Driver;

public class SendAMessagePage {

private Driver driver;
	
	private By linkMessagesLocator;
	private By linkSendAMessageLocator;
	private By rbtnSentToAllConnectionsLocator;
	private By rbtnSentToSelectConnectionsLocator;
	private By txtRecipientLocator;
	private By recipientLocator;
	private By txtSubjectLocator;
	private By txtMessageLocator;
	private By btnSendLocator;
	
	public SendAMessagePage (Driver driver)
	{
		this.driver = driver;
	
		linkMessagesLocator = By.xpath(".//*[@id='nav-container']/ul[1]/li[4]/div/a/span");
		linkSendAMessageLocator = By.xpath(".//*[@id='sub-nav-messages']/li[2]/a");
		rbtnSentToAllConnectionsLocator = By.xpath(".//*[@id='MessageSendToAllConnections']");
		rbtnSentToSelectConnectionsLocator = By.xpath(".//*[@id='MessageSendToSelectConnections']");
		txtRecipientLocator = By.xpath(".//*[@id='MessageSendForm']/div[2]/div[2]/input");
		recipientLocator = By.cssSelector(".ui-autocomplete.ui-menu.ui-widget.ui-widget-content.ui-corner-all");
		txtSubjectLocator = By.xpath(".//*[@id='MessageSubject']");
		txtMessageLocator = By.xpath(".//*[@id='MessageBody']");
		btnSendLocator = By.xpath(".//*[@id='MessageSendForm']/a");
	}
	
	public void launch()
	{
		driver.openPage("https://staging.joordev.com/");
	}
	
	public void clickMessages()
	{
		driver.clickElement(linkMessagesLocator);
	}

	public void clickSendAMessage()
	{
		driver.clickElement(linkSendAMessageLocator);
		
	}
	
	public void selectSentToAllConnections()
	{
		driver.clickElement(rbtnSentToAllConnectionsLocator);
	}
	public void selectSentSelectConnections()
	{
		driver.clickElement(rbtnSentToSelectConnectionsLocator);
	}
	
	public void enterRecipient(String recipient)
	{
		driver.sendKeys(recipient, txtRecipientLocator);
		//driver.clickElement(recipientLocator);
	}
	
	public void clickRecipient()
	{
		WebElement select = driver.findElement(recipientLocator);
		List<WebElement> options = select.findElements(By.tagName("JOOR Regress ( JR112 ) - New York, NY "));

		for (WebElement option : options) {
		    if("JOOR Regress ( JR112 ) - New York, NY".equals(option.getText()))
		    {
		    	driver.mouseHover(recipientLocator);
		    } 
		}
	
		//driver.clickElement(recipientLocator);
	}
	public void enterSubject(String subject)
	{
		driver.sendKeys(subject, txtSubjectLocator);
	}
	
	public void enterMessage(String message)
	{
		driver.sendKeys(message, txtMessageLocator);
	}
	
	public void clicSendBtn()
	{
		driver.clickElement(btnSendLocator);
	}
	public void sleep(int segundos)throws InterruptedException
	{
		driver.sleep(segundos);
	}
}

