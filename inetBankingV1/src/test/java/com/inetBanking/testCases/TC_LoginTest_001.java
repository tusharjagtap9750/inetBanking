package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		log.info("URL is Opened");
		
		LoginPage credential = new LoginPage( driver);
		 credential.sendusername(username);
		 log.info("Entered user name");
		 
		 credential.sendpassword(password);
		 log.info("Entered password");
		 
		 credential.clickonlogin();
		 log.info("Clicked on login button");

		 
		 if(driver.getTitle().equals("actiTIME - Login"))
		 {
			 log.info("Page title is right");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 log.error("Error in the home page title");
			 Assert.assertTrue(false);
		 }
		
	}

}
