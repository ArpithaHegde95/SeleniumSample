package com.SamProject.testCases;
import com.SamProject.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
    ReadConfig readconfig=new ReadConfig();
    public String baseUrl=readconfig.getApplicationURL();
    public String username=readconfig.getUserName();
    public String password=readconfig.getPassword();
    public static WebDriver driver;
   
    @Parameters("browser")
    @BeforeClass
    public void setUp(String br)
    {
    	if(br.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
    		ChromeOptions option=new ChromeOptions();
    		option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
    		driver=new ChromeDriver(option);
    		driver.get(baseUrl);
    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
    	}
    }
    
    
    @AfterClass
    public void tearDown()
   {
   	driver.quit();
    }
   }
