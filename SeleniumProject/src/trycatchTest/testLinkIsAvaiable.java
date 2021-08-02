package trycatchTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLinkIsAvaiable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		try { 											// aGmail is wrong linkText
			boolean link = driver.findElement(By.linkText("aGmail")).isDisplayed();
			
			//boolean link = driver.findElement(By.linkText("Gmail")).isDisplayed(); // it will pass..

			if (link = true) {

				System.out.println("Gmail link is Exists in google Home Page the test Is passed");
			}
		}
 
		
		// This is else When it will throws exceptions it will become catch for handeling execeptions...
		
		catch (NoSuchElementException e) {

			System.out.println("Gmail link is not Exists in google Home Page the test Is failed");

		}

		driver.close();
	}
}
