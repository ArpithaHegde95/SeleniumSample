package com.SamProject.utilities;

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
			 File src=new File("./Configuration/config.properties");
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
	 
	 public String getUserName()
	 {
		 String uname=pro.getProperty("username");
		 return uname;
	 }
	 
	 public String getPassword()
	 {
		 String pwd=pro.getProperty("password");
		 return pwd;
	 }
	 
	 public String getChromeDriver()
	 {
		 String cd=pro.getProperty("chromeDriver");
		 return cd;
	 }
	 
	 public String getChromePath()
	 {
		 String cp=pro.getProperty("chromePath");
		 return cp;
	 }
}
