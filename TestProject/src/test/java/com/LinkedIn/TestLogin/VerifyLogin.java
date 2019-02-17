package com.LinkedIn.TestLogin;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LinkedIn.BasePage.BaseClass;
import com.LinkedIn.Pages.LoginPage;

public class VerifyLogin extends BaseClass {

    @Test
	public void login()
	{
    	Logger logger=Logger.getLogger("VerifyLogin ");
    	PropertyConfigurator.configure(".\\src\\test\\resources\\propertiesfile\\log4j.properties");
    	
        BaseClass obj1=PageFactory.initElements(driver,BaseClass.class);
        obj1.openBrowser("chrome", "https://www.linkedin.com");
        logger.info("open Browser");
        
		LoginPage obj2=PageFactory.initElements(driver,LoginPage.class);
		obj2.LoginFunctionality("manikvasu3011@gmail.com", "9302787844");
		logger.info("Login is done");
		
	}

	}


