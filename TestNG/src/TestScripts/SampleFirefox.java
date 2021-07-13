package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestCases.SauceDemo;


public class SampleFirefox {

	WebDriver driver;
	SauceDemo sd;


	@Test
	public void firefoxTest() throws InterruptedException {

		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.quit();
	}

	@Test

	public void Login() throws InterruptedException {

		boolean u = sd.UserId().isEnabled();
		Assert.assertTrue(u);
		sd.UserId().sendKeys("standard_user");
		Thread.sleep(1000);

		boolean p = sd.Password().isEnabled();
		Assert.assertTrue(p);
		sd.Password().sendKeys("secret_sauce");
		Thread.sleep(1000);

		boolean z = sd.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		sd.LoginButton().click();
		Thread.sleep(1000);
	}
}
