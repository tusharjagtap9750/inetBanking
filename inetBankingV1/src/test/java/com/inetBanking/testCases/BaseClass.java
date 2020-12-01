package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass 
{
	public static WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	
	public static Logger log;
	@BeforeClass
	public void setup()
	{
		//driver configuration
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
		
		//Logger configuration
		log = Logger.getLogger(getClass());
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
