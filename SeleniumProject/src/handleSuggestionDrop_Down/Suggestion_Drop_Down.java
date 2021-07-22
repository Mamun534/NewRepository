package handleSuggestionDrop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Suggestion_Drop_Down {
	
	
	//it is called mouseHover......

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		WebElement el = driver.findElement(By.xpath("/html/body/a[1]"));
		
		Actions act =new Actions(driver);
		act.moveToElement(el).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));

		int total_count = links.size();
		
		for(int i=0; i<total_count; i++) 
		{
			WebElement ele = links.get(i);
			String text = ele.getAttribute("inneraHTML");
			System.out.println("Links Name is "+ text);
		}
	}
}
