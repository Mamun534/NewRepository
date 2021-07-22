package getColorOfElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class backGroundColor_cssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://reqres.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("window.scrollBy(0,6000)",""); // This is Using pixel...

		WebElement el = driver.findElement(By.xpath("//*[@id=\"trigger-pro\"]"));

		js.executeScript("arguments[0].scrollIntoView();", el); // This is using WebElement ..

		String backGroundColor = el.getCssValue("color");
		System.out.println(backGroundColor);

		String hexcolor = Color.fromString(backGroundColor).asHex();
		System.out.println(hexcolor);
		
		if (backGroundColor.equals("rgba(255, 255, 255, 1)"))
			System.out.println("Test is passed");

		else
			System.out.println("Test Is failed");
	}

}
