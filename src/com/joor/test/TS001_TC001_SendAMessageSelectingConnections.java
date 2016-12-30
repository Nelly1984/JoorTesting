package com.joor.test;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.joor.models.SendAMessagePage;
import com.joor.models.LoginPage;
import com.joor.setup.MainTestCase;
public class TS001_TC001_SendAMessageSelectingConnections extends MainTestCase{

	
	@Test
	public void loginJoor() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver());
		login.launch();
		login.sleep(2);
		login.clickIconLogin();
		login.enterUser("qatest1");
		login.enterPassword("qatest1");
		login.clickBtnSignIn();
		login.sleep(2);
		SendAMessagePage SendAMessage = new SendAMessagePage(driver());
		SendAMessage.clickMessages();
		SendAMessage.clickSendAMessage();
		login.sleep(2);
		//SendAMessage.selectSentToAllConnections();
		SendAMessage.selectSentSelectConnections();
		SendAMessage.enterRecipient("Joor");
		SendAMessage.clickRecipient();
		SendAMessage.enterSubject("Test");
		SendAMessage.enterMessage("Test");
		SendAMessage.clicSendBtn();
		login.sleep(2);
		//login.clickLinkLogout();
		
		//AssertJUnit.assertEquals("", "");
	}
	
}
