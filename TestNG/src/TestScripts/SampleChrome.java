package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleChrome{

	WebDriver driver;

	
	@Test
	public void ChromeTest() {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
