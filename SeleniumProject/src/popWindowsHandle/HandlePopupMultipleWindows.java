package popWindowsHandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// This link i used for single window..
		driver.get("https://www.naukri.com/"); // file:///C:/Users/Owner/OneDrive/Desktop/my-Xml%20link.html
		String parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		System.out.println("Parent window id is " + parent);

		// driver.findElement(By.xpath("//a[contains(@href,'https://www.google.com')]")).click();

		Set<String> allwindows = driver.getWindowHandles();

		int count = allwindows.size();

		System.out.println("Total Window : " + count);

		// This called enanched for Loop.....

		for (String child : allwindows)

		{
			if (!parent.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);

				System.out.println("This is child Window : " + driver.getTitle());
				
				// driver.findElement(By.name("q")).sendKeys("JAVA");
				
				Thread.sleep(2000);
				
				driver.close();
			}
		}
				driver.switchTo().window(parent);
				System.out.println("This is parent window title :" + driver.getTitle());
		/*
		 * try {
		 * 
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.dismiss(); }catch(NoAlertPresentException e) {
		 * 
		 * System.out.println("Something went Wrong Please chacke the Exception" +
		 * e.getMessage());
		 * 
		 * }
		 */
				
		/*
		 * JavascriptExecutor je = (JavascriptExecutor)driver; WebElement el =
		 * driver.findElement(By.xpath("/html/body"));
		 * je.executeScript("arguments[0].scrollIntoView(true);", el);
		 * System.out.println(el.getText());
		 */
	}

}
