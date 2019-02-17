package com.LinkedIn.TestHome;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.LinkedIn.BasePage.BaseClass;
import com.LinkedIn.Pages.HomePage;
import com.LinkedIn.Pages.LoginPage;

public class VerifyHome extends BaseClass {
	
@Test
public void Home() throws Exception
{
	 BaseClass obj=PageFactory.initElements(driver,BaseClass.class);
	 obj.openBrowser("chrome", "https://www.linkedin.com");
     
	
     LoginPage obj1=PageFactory.initElements(driver,LoginPage.class);
	 obj1.LoginFunctionality("manikvasu3011@gmail.com", "9302787844");
	
     HomePage obj2=PageFactory.initElements(driver, HomePage.class);
     //obj2.uploadPicture();
     obj2.myJob("testing", "noida");
     obj2.myMsgTab("tarun", "hii");
     
	 
	
	}

}
