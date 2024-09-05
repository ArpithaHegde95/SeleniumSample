package com.LinkedInHybridProject.testCases;
import java.time.Duration;
import org.testng.annotations.Test;

import com.LinkedInHybridProject.pageObjects.LoginPage;

public class LoginPageWithInValidUsername extends BaseClass
{
	@Test(priority=1)
	public void LoginInValidUsername()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setLoginbutton();
		lp.setEmail(invalidusername);
		lp.setPassword(validpassword);
		lp.setLoginbnt();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.settextname();
	}
}
