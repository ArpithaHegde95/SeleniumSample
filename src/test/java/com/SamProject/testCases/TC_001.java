package com.SamProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SamProject.pageObjects.LoginPage;
import com.SamProject.testCases.BaseClass;
public class TC_001 extends BaseClass {

	@Test
	public void LoginTest() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setLoginbutton();
		lp.setEmail(username);
		lp.setPassword(password);
		lp.setLoginbnt();
		
		if(driver.getTitle().equals(""))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
