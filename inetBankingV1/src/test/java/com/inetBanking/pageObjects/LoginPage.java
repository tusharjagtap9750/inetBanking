package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//input[@name='username']")           
	private WebElement username;

	@FindBy (xpath="//input[@type='password']")
	private WebElement password;

	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginbutton;

	public void  sendusername(String string)
	{
		username.sendKeys("admin");
	}
	
	public void  sendpassword(String string)
	{
		password.sendKeys("manager");
	}
	
	public void  clickonlogin()
	{
		loginbutton.click();
	}
}
