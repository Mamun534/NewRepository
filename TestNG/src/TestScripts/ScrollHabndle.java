package TestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollHabndle

{

	@Test
	public void ScrollHandleDemo() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://bdlist24.com/demo/");
		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("//*[@id=\"content\"]/div[1]/div/div[8]/div/p.scrollIntoview(true)", je);
	}

}
