package popWindowsHandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandlePopupMultipleWindowsAndDoOprations {
	
	// Handle Popup Multiple Windows And Go to specific window Do Oprations come back to parent window....
	
	static public void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30); // explicitly wait..
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Parent window id is " + parent);

		Set<String> allwindows = driver.getWindowHandles();
		
		// This is convert Set to ArryList........
		
		ArrayList<String> tabs = new ArrayList<>(allwindows);
	
		// this is Multiple popups windows...
		
		tabs.get(0);
		tabs.get(1);
		tabs.get(2);

		driver.switchTo().window(tabs.get(1));
		System.out.println("This is Popups Window One : "+driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(2));
		System.out.println("This is Popups Window Two : "+driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));
		System.out.println("This is Parent Window : "+driver.getTitle());
		String expected = "https://www.naukri.com/";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);
		System.out.println("The Test is Paased.....:");
		driver.switchTo().window(tabs.get(1)).close();
		driver.switchTo().window(tabs.get(2)).close();
		Thread.sleep(2000);
		driver.quit();
	}
}
