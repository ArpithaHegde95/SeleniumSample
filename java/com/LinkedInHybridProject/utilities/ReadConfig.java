package com.LinkedInHybridProject.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadConfig 
{
	 Properties pro;
	 public ReadConfig()
	 {
		 try
		 {
			 File src=new File("./configuration/config.properties");
			 FileInputStream fis=new FileInputStream(src);
			 pro=new Properties();
			 pro.load(fis);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception is "+e.getMessage());
		 }
	 }
	 
	 public String getApplicationURL()
	 {
		 String url=pro.getProperty("baseUrl");
		 return url;
	 }
	 
	 public String getValidUserName()
	 {
		 String uname=pro.getProperty("validusername");
		 return uname;
	 }
	 
	 public String getValidPassword()
	 {
		 String pwd=pro.getProperty("validpassword");
		 return pwd;
	 }
	 
	 public String getInvalidUserName()
	 {
		 String cd=pro.getProperty("invalidusername");
		 return cd;
	 }
	 
	 public String getInvalidPassword()
	 {
		 String cp=pro.getProperty("invalidpassword");
		 return cp;
	 }
	 public String getUserName()
	 {
		 String cp=pro.getProperty("username");
		 return cp;
	 }
	 public String getCompanyName()
	 {
		 String cp=pro.getProperty("companyname");
		 return cp;
	 }
}
