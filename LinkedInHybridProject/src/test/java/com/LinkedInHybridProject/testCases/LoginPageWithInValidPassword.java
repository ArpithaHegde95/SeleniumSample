package com.LinkedInHybridProject.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.LinkedInHybridProject.pageObjects.LoginPage;

public class LoginPageWithInValidPassword extends BaseClass
{
	@Test(priority=1)
	public void LoginInValidPassword()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setLoginbutton();
		lp.setEmail(validusername);
		lp.setPassword(invalidpassword);
		lp.setLoginbnt();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.settextname();
	}
}
