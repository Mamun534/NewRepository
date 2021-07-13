package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {

	WebDriver driver;

	@Test
	public void ChromeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void TestRadio() {
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name=\"lang\"and @type=\"radio\"]"));
		
		for (int i = 0; i < radio.size(); i++) {
			WebElement local_radio = radio.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("value");

			if (value.equalsIgnoreCase("Python")) {
				local_radio.click();

			}
		}
	}

}
