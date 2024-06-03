package com.LinkedInHybridProject.pageObjects;

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
	
	@FindBy(xpath="//*[@id=\"username\"]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"organic-div\"]/form/div[3]/button")
	@CacheLookup
	WebElement Loginbnt;
	
	@FindBy(xpath="//*[@id=\"error-for-password\"]")
	@CacheLookup
	WebElement textname;
	
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
	
	public void settextname()
	{
		if(textname.isDisplayed()==true)
		{
			System.out.println("Invalid value is provided to the application");
		}
	} 
}
