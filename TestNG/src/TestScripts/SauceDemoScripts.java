package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestCases.SauceDemo;

public class SauceDemoScripts {

	WebDriver driver;
	SauceDemo sd;

	@BeforeTest
	@Parameters("browser")

	public void Setup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("Firefox")) {
			
			  System.setProperty("Webdriver.gecko.driver",
			  "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Browser is not correct");
		}
		sd = new SauceDemo(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*
	 * @BeforeTest
	 * 
	 * public void setupTest() throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
	 * 
	 * driver = new ChromeDriver(); sd = new SauceDemo(driver);
	 * driver.get("https://www.saucedemo.com/");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.manage().deleteAllCookies(); driver.manage().window().maximize();
	 * Thread.sleep(1000); }
	 */


	/*
	 * @AfterMethod public void Screenshots() {
	 * 
	 * Multiple_Test_Pages.Utility.CaptureScreenshot(driver, "SauceDemo"); }
	 */

	@AfterTest

	public void endTest() {
		driver.close();
	}

	@Test(priority = 0, groups = "Regression")

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
	}

	@Test(priority = 1, groups = "Regression")

	public void Shopping() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = sd.backpackText().isDisplayed();
		Assert.assertTrue(x);
		String backpackText = sd.backpackText().getText();
		System.out.println(backpackText);
		Thread.sleep(1000);

		boolean c = sd.backPackPrice().isDisplayed();
		Assert.assertTrue(c);
		String backPackPrice = sd.backPackPrice().getText();
		System.out.println(backPackPrice);

		boolean d = sd.backPackAddCart().isDisplayed();
		Assert.assertTrue(d);
		sd.backPackAddCart().click();
		Thread.sleep(1000);

		boolean e = sd.Cart().isDisplayed();
		Assert.assertTrue(e);
		sd.Cart().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/cart.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);

		boolean q = sd.ContinueShoping().isDisplayed();
		Assert.assertTrue(q);
		sd.ContinueShoping().click();
		Thread.sleep(2000);

		String expected1 = "https://www.saucedemo.com/inventory.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 2, groups = "Regression")

	public void ContinueShoping() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean y = sd.fleeceJacketText().isDisplayed();
		Assert.assertTrue(y);
		String fleeceJacketText = sd.fleeceJacketText().getText();
		System.out.println(fleeceJacketText);
		Thread.sleep(1000);

		boolean q = sd.FleeceJacketPrice().isDisplayed();
		Assert.assertTrue(q);
		String FleeceJacketPrice = sd.FleeceJacketPrice().getText();
		System.out.println(FleeceJacketPrice);
		Thread.sleep(2000);

		boolean z = sd.FleeceJacketAddCart().isDisplayed();
		Assert.assertTrue(z);
		sd.FleeceJacketAddCart().click();
		Thread.sleep(1000);

		boolean e = sd.Cart().isDisplayed();
		Assert.assertTrue(e);
		sd.Cart().click();
		Thread.sleep(1000);

		boolean co = sd.ClickCheckout().isDisplayed();
		Assert.assertTrue(co);
		sd.ClickCheckout().click();
		Thread.sleep(1000);

		String expected1 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 3, groups = "Regression")

	public void UserInformation() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = sd.FirstName().isEnabled();
		Assert.assertTrue(x);
		sd.FirstName().sendKeys("Mike");
		Thread.sleep(1000);

		boolean y = sd.LastName().isEnabled();
		Assert.assertTrue(y);
		sd.LastName().sendKeys("Hadson");
		Thread.sleep(1000);

		boolean z = sd.ZipCode().isEnabled();
		Assert.assertTrue(z);
		sd.ZipCode().sendKeys("11367");
		Thread.sleep(1000);

		boolean q = sd.ClickContinue().isDisplayed();
		Assert.assertTrue(q);
		sd.ClickContinue().click();

		String expected1 = "https://www.saucedemo.com/checkout-step-two.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 4, groups = "Regression")

	public void TotalPrice() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = sd.TotalPrice().isDisplayed();
		Assert.assertTrue(x);
		String totalprice = sd.TotalPrice().getText();
		System.out.println(totalprice);
		Thread.sleep(1000);

		boolean q = sd.Tax().isDisplayed();
		Assert.assertTrue(q);
		String tax = sd.Tax().getText();
		System.out.println(tax);

		boolean c = sd.FinalPrice().isDisplayed();
		Assert.assertTrue(c);
		String fp = sd.FinalPrice().getText();
		System.out.println(fp);

		boolean y = sd.Finish().isDisplayed();
		Assert.assertTrue(y);
		sd.Finish().click();

		String expected1 = "https://www.saucedemo.com/checkout-complete.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		boolean bt = sd.BackToHome().isDisplayed();
		Assert.assertTrue(bt);
		sd.BackToHome().click();
	}

}
