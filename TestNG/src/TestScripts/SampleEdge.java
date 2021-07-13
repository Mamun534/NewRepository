package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleEdge{

	WebDriver driver;
	
	
	@Test
	public void EdgeTest() throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("This Is Tittle "+driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
	}
}
