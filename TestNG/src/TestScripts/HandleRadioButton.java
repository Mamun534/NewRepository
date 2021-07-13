package TestScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleRadioButton {

	WebDriver driver;

	// Handle MultiPle Radio Button...

	@Test
	public void RadioButtonHandle() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		WebDriver driver = new ChromeDriver();
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name=\"lang\"and @type=\"radio\"]"));
		// it will return list of elements..

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
