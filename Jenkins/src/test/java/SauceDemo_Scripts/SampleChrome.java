package SauceDemo_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SauceDemo_POM.SauceDemo;

public class SampleChrome {

	WebDriver driver;
	SauceDemo sd;

	@BeforeTest

	public void ChromeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		sd = new SauceDemo(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	@Test

	public void login() throws InterruptedException {

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
	}
}