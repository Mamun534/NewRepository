package SauceDemo_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import SauceDemo_POM.SauceDemo;

public class ScrollPage {
	WebDriver driver;
	SauceDemo sd;


	@BeforeTest
	
	public void setupTest() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		  
		  driver = new ChromeDriver(); 
		  sd = new SauceDemo(driver);
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies(); driver.manage().window().maximize();
		  Thread.sleep(1000); 
		  }
	

	@Test(priority =1)

	public void LoginData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean x = sd.UserId().isEnabled();
		Assert.assertTrue(x);
		sd.UserId().sendKeys("standard_user");
		Thread.sleep(1000);
		
		boolean y = sd.Password().isEnabled();
		Assert.assertTrue(y);
		sd.Password().sendKeys("secret_sauce");
		Thread.sleep(1000);

		boolean z = sd.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		sd.LoginButton().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/inventory.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);
		driver.quit();
	}
	
	
	@Test(priority=2)
	public void ScrollDown() {
		
		
		JavaScriptExecutor je = (JavaScriptExecutor)driver;
	
		
	}
}
