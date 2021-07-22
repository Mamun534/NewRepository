package popWindowsHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"
				+"search?q=w3schools+sql&rlz"
				+"=1C1CHBF_enUS948US948&oq=w3&aqs"
				+"=chrome.0.69i59j69i57j0i131i433l4j0i433j0l3"
				+".2759j0j9&sourceid=chrome&ie=UTF-8");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) driver;		 // its called type casting also....
		WebElement el = driver.findElement(By.xpath("//span[@id='gc9Iqb']"));
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		Thread.sleep(2000);
		System.out.println(el.getText());
		driver.quit();
	}

}
