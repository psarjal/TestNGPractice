package com.LinkedIn.Pages;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.LinkedIn.BasePage.BaseClass;

public class HomePage extends BaseClass {

	public void writeAnArticle(String Article) throws Exception
	{
		String ParentWindow=driver.getWindowHandle();
		writeAnArticle.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    Set<String> s1=driver.getWindowHandles();
		
		for(String obj: s1)
		{
		if(obj!=ParentWindow)
		{
			driver.switchTo().window(obj);
			System.out.println("Child window = "+ driver.getTitle());
			
	   }
		Thread.sleep(3000);
	    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		headLine.sendKeys("TEXT");
		typeArticle.sendKeys( Article);
		
		Thread.sleep(3000);
		publishBtn.click();
		Thread.sleep(5000);
		//driver.switchTo().window(ParentWindow);
		}
	}
	
	public void uploadPicture()
	{
		uploadPicture.sendKeys("H:\\vasu\\image\\FB_IMG_1488823093949.jpg");
		 postImage.click();
		 Assert.assertEquals(false,true);
		 
	}
	
	
	public List<WebElement> getProfileName() 
	{
		myNetwork.click();
		connectionName.click();
	     return profileName;
		
		
	   
		
	}
	
	public void myJob(String job,String Place)
	{
      	myJob.click();
      	jobSearch.sendKeys(job);
      	placeSearch.sendKeys(Place);
      	SrchBtn.click();
		
	}
	
	public void myMsgTab(String FrndName, String message)
	{
		myMsgTab.click();
		srchTab.sendKeys(FrndName);
		MsgTab.sendKeys(message);
		sendBtn.click();
		
	}
	
	//**********************************************************************************
	@FindBy(xpath="//a[text()='Write an article']")
	WebElement writeAnArticle;
	

	@FindBy(xpath="//textarea[@class='ember-text-area post-headline ember-view']")
	WebElement headLine;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement  typeArticle;
	
	@FindBy(xpath="//button[@class='zen-nav__action-button action-button--publish']")
	WebElement publishBtn;
//*********************************************************************s	

	@FindBy(xpath="//a[@data-control-name='identity_welcome_message']")
	WebElement  updateProfile;
	
	@FindBy(xpath="//button[@class='profile-photo-edit__edit-btn']")
	WebElement  clickProfile;
	//*********************************************************
	@FindBy(xpath="//div[@class='button-secondary-small-muted small-icon button sharing-share-action-media tap-target sharing-subaction-bar__photo-button ember-view']")
	WebElement  uploadPicture;
	
	@FindBy(xpath="//div[@class='sharing-share-box__post-button-container']")
	WebElement postImage;
	//******************************My Network
	
	
	@FindBy(id="mynetwork-tab-icon")
	WebElement  myNetwork;
	
	@FindBy(xpath="//div[@class='mn-social-proof__facepiles']")
	WebElement  connectionName;

	@FindBy(id="Text")
	 List<WebElement>  profileName;
	
	@FindBy(xpath="//span[@id='mynetwork-tab-icon']")
	WebElement  myNetwork1;
	
//*************************************Job Search
	

	@FindBy(id="jobs-tab-icon")
	WebElement  myJob;
	
	@FindBy(xpath="//input[contains(@id,'jobs-search-box-keyword-id-ember')]")
	WebElement  jobSearch;
	
	@FindBy(xpath="//input[contains(@id,'jobs-search-box-location-id-ember')]")
	WebElement  placeSearch;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement SrchBtn;
	//******************************************************MessageTab
	

	@FindBy(id="messaging-tab-icon")
	WebElement  myMsgTab;
	
	@FindBy(xpath="//input[@id='search-conversations']")
	WebElement  srchTab;
	
	@FindBy(xpath="//div[@class='msg-form__contenteditable t-14 t-black--light t-normal flex-grow-1']")
	WebElement  MsgTab;
	
	@FindBy(xpath="//button[text()='Send']")
	WebElement  sendBtn;
	
	
	
}
