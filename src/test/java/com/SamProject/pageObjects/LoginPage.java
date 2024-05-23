package com.SamProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/nav/div/a[2]")
	@CacheLookup
	WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"session_key\"]")
	@CacheLookup
	WebElement txtEmail;
	@FindBy(xpath="//*[@id=\"session_password\"]")
	@CacheLookup
	WebElement txtPassword;
	@FindBy(xpath="//*[@id=\'loginForm\']/button[2]/span/span")
	@CacheLookup
	WebElement Loginbnt;
	public void setLoginbutton()
	{
		loginbutton.click();
	} 
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setLoginbnt()
	{
		Loginbnt.click();
	}
	
}
