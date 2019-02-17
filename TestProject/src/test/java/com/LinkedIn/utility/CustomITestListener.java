package com.LinkedIn.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.LinkedIn.BasePage.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class CustomITestListener extends BaseClass implements ITestListener{
	
    ExtentHtmlReporter reports=new ExtentHtmlReporter("E:\\study material\\Selenium_Workspace\\extent.html");
	 ExtentReports extent=new ExtentReports();
	ExtentTest test;
     public void onTestStart(ITestResult result) {
    	 System.out.println("Test is starting");
    	 test=extent.createTest(result.getMethod().getMethodName());
	
}

  public void onTestSuccess(ITestResult result) {
	  System.out.println("This " + result.getMethod().getMethodName() +" is pass");
	  test.log(Status.PASS, "This " + result.getMethod().getMethodName() +" is pass");
}

   public void onTestFailure(ITestResult result) {
	 
		System.out.println("This " + result.getMethod().getMethodName() +" is fail");
	    test.log(Status.FAIL, "This " + result.getMethod().getMethodName() +"is fail");
	    
	    TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("E:\\study material\\Selenium_Workspace\\TestProject\\src\\test\\resources\\screenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
 }

   public void onTestSkipped(ITestResult result) {
	System.out.println("This " + result.getMethod().getMethodName() +" is skip");
	test.log(Status.SKIP,  "This " + result.getMethod().getMethodName() +"is skkip");
	
}

   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

   public void onStart(ITestContext context) {
	extent.attachReporter(reports);
	
}

   public void onFinish(ITestContext context) {
	extent.flush();
	
}

}
