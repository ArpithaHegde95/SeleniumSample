package com.LinkedInHybridProject.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.LinkedInHybridProject.pageObjects.HomePage;
import com.LinkedInHybridProject.pageObjects.LoginPage;

public class HomePageWithCompanyProfile extends BaseClass
{
	@Test(priority=1)
	public void LoginValidCredencials()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setLoginbutton();
		lp.setEmail(validusername);
		lp.setPassword(validpassword);
		lp.setLoginbnt();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.getPageSource().contains("LinkedIn News"))
		{
			System.out.println("Text is present in right side");
		}
		else
		{
			System.out.println("Text is not present in right side");
		}
	}
	
	@Test(priority=2)
	public void HomeWithCompanyProfile()
	{
		HomePage hp=new HomePage(driver);
		hp.setSearchbox(companyname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.setViewPagebtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.settextname();
	}
}
