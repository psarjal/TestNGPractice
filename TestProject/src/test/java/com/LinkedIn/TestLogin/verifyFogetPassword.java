package com.LinkedIn.TestLogin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LinkedIn.BasePage.BaseClass;
import com.LinkedIn.Pages.LoginPage;

public class verifyFogetPassword extends BaseClass {

	
	@Test
	public void fogetPassword()
	{
		
		BaseClass obj1=PageFactory.initElements(driver,BaseClass.class);
        obj1.openBrowser("chrome", "https://www.linkedin.com");
        
		LoginPage obj2=PageFactory.initElements(driver,LoginPage.class);
		obj2.forgetPassword("abc@gmail.com");
		
		
		
		
	}

}
