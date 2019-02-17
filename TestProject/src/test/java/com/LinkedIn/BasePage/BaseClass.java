package com.LinkedIn.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseClass {

   public static WebDriver driver;
   public void openBrowser(String browserName,String Url)
  {
	if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\study material\\Selenium_Workspace\\TestProject\\src\\test\\resources\\drivers\\chromedriver.exe" );
		 driver=new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver","E:\\study material\\Selenium_Workspace\\TestProject\\src\\test\\resources\\drivers\\geckodriver.exe"  );
		 driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.get(Url);
//	Assert.assertEquals("chome",driver.getTitle());	
	
 }
@AfterMethod
public void closeBrowser()
  {
	driver.close();
	
	}
@AfterSuite
public void QuitBrowser()
{
 driver.quit();	
 
}
}
