package com.LinkedIn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public void LoginFunctionality(String userName, String password)
	{
		enterUsername.sendKeys(userName);
		enterPassword.sendKeys(password);
		singinBtn.click();
	}
	
	public void forgetPassword(String userName)
	{
		clickForgetBtn.click();
		Username.sendKeys( userName);
		submitFindBtn.click();
	}
	
	public void findColleague(String firstName, String lastName)
	{
		 FirstName.sendKeys(firstName);
		 LastName.sendKeys(lastName);
		 searchBtn.click();
	}
	
	@FindBy(id="login-email")
	 WebElement enterUsername;
	
	@FindBy(id="login-password")
	WebElement enterPassword;        
	
	@FindBy(id="login-submit")
	WebElement singinBtn;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement clickForgetBtn;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	
	@FindBy(xpath="//button[@id='reset-password-submit-button']")
	WebElement submitFindBtn;
	
	@FindBy(xpath="//input[@name='first']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='first']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@class='submit-btn']")
	WebElement searchBtn;
	
	
	
	
	
	
	

}
