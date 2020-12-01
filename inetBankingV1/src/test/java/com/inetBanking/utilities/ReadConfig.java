package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		System.out.println("hi");
		File src = new File("Configuration" +File.separator+ "config.properties");
		System.out.println("bye");

		try 
		{
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
			System.out.println("hiii");
		}
		catch(IOException e) 
		{
			System.out.println("Exception is: "+e);
		}
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
}
