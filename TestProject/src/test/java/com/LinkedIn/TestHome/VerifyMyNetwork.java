package com.LinkedIn.TestHome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LinkedIn.BasePage.BaseClass;
import com.LinkedIn.Pages.HomePage;
import com.LinkedIn.Pages.LoginPage;

public class VerifyMyNetwork  extends BaseClass
{
   
	@Test
	public void TestMyNetwork() throws Exception
	{
		BaseClass obj=PageFactory.initElements(driver,BaseClass.class);
		obj.openBrowser("chrome","https://www.linkedin.com");
		
		LoginPage obj2=PageFactory.initElements(driver,LoginPage.class);
		obj2.LoginFunctionality("manikvasu3011@gmail.com", "9302787844");
		
		HomePage obj3=PageFactory.initElements(driver,HomePage.class);
		obj3.myNetwork();
	
		
		List<WebElement> wb=driver.findElements(By.xpath("//span[contains(@class,'mn-connection-card__name t-16 t-black t-bold')]"));
		for(WebElement name:wb)
		{
			System.out.println(name.getText());
		}
	}

}
