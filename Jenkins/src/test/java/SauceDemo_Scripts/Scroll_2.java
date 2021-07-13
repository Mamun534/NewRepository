package SauceDemo_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Scroll_2 {
	
	
	@Test
	public void Scroolpagedown() throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com");
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}

}
