package com.SamProject.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SamProject.pageObjects.LoginPage;

public class TC_002 extends BaseClass
{
	@Test
	public void LoginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setLoginbutton();
		lp.setEmail(username);
		lp.setPassword(password);
		lp.setLoginbnt();
		
	}
}
