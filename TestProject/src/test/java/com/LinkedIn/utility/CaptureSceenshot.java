package com.LinkedIn.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.LinkedIn.BasePage.BaseClass;

public class CaptureSceenshot extends BaseClass{
	
	
	public static void Screenshot()
	{
	TakesScreenshot sceenshot=(TakesScreenshot)driver;
	File source=sceenshot.getScreenshotAs(OutputType.FILE);
     try {
		FileUtils.copyFile(source,new File( ".\\src\\test\\resources\\screenshot.png"));
	} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
}
