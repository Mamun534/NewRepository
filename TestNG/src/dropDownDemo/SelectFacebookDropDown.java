package dropDownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropDown {

	@Test
	public void Selectvalue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println(driver.getTitle());
		
		driver.findElement(By.id("u_0_2_TG")).click();

		WebElement month_dd = driver.findElement(By.id("month"));

		Select sm = new Select(month_dd);

		
		WebElement selectedvalue= sm.getFirstSelectedOption();
		
		// it will select march
		
		sm.selectByIndex(3);
		WebElement selectedvalue1 = sm.getFirstSelectedOption();
		System.out.println("After selection value "+selectedvalue1.getText());
		Thread.sleep(3000);

		// it will select oct

		sm.selectByValue("10");

		Thread.sleep(3000);

		// it will select Aug

		sm.selectByVisibleText("Aug");

		driver.close();
	}
}
