package com.LinkedIn.TestLogin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LinkedIn.BasePage.BaseClass;
import com.LinkedIn.Pages.LoginPage;



public class verifyFindColleague {
	public class VerifySearchColleague extends BaseClass {

		
		@Test
		public void searchcolleague()
		{
			 BaseClass obj=PageFactory.initElements(driver,BaseClass.class);
			obj.openBrowser("chrome","https://www.linkedin.com");
			
			LoginPage Search = PageFactory.initElements(driver,LoginPage.class);
			 Search.findColleague("Pankaj", "Sarjal");
	
	}

}}
