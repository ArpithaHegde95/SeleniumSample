package com.LinkedInHybridProject.testCases;
import java.time.Duration;

import org.testng.annotations.Test;

import com.LinkedInHybridProject.pageObjects.LoginPage;

public class LoginPageWithValidCredencials extends BaseClass
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
