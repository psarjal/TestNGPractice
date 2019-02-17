package practicePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestCode {

	
	
	@Test
	public void test()
	{
			System.setProperty("webdriver.chrome.driver","E:\\study material\\Selenium_Workspace\\TestProject\\src\\test\\resources\\drivers\\chromedriver.exe" );
	     	WebDriver driver=new ChromeDriver();
            driver.get("https://www.linkedin.com/");
            driver.findElement(By.id("login-email")).sendKeys("manikvasu3011@gmail.com");
            driver.findElement(By.id("login-password")).sendKeys("9302787844");
            driver.findElement(By.id("login-submit")).click();
            driver.findElement(By.id("mynetwork-tab-icon")).click();
            driver.findElement(By.xpath("//div[@class='mn-social-proof']")).click();
			List<WebElement> wb=driver.findElements(By.xpath("//span[contains(@class,'mn-connection-card__name t-16 t-black t-bold')]"));
			for(WebElement name:wb)
			{
				System.out.println(name.getText());
			}
			
	}
	
	
}
