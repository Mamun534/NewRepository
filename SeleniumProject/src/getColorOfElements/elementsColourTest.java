package getColorOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsColourTest {

	// Using css find the Background Colour...

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://bdlist24.com/demo/");

		WebElement e = driver.findElement(By.xpath("//*[@id=\"advance_form_btn\"]"));

		String backcolour = e.getCssValue("background-color");

		System.out.println(backcolour);
	}
}
