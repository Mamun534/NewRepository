package SauceDemo_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframeChrome{

	WebDriver driver;

	@Test

	public void ChromeTest() {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Owner/OneDrive/Desktop/test.html");
		driver.switchTo().frame("bdlist24");
		driver.findElement(By.xpath("//*[@id=\"cz_search\"]")).click();
		driver.findElement(By.name("cz_search")).sendKeys("11003");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
