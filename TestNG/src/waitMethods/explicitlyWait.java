package waitMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class explicitlyWait {

	WebDriver driver;

	
	@BeforeMethod
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {

		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("dummy@gmail.com");
		element.sendKeys(Keys.RETURN);
		driver.findElement(By.id("Passwd")).sendKeys("password");
		driver.findElement(By.id("signIn")).click();
		
		// explicit wait - to wait for the compose button to be click-able
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}