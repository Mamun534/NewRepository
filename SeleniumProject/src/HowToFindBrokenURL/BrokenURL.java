package HowToFindBrokenURL;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenURL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links Are Available " + links.size()); 
		List<String> urlList = new ArrayList<String>();

		for (WebElement e : links) {

			String url = e.getAttribute("href");
			urlList.add(url);
			//BrokenLink(url);  // This is chacking one by one link

			
		} // This is Parallel Run The all Links...
		Long StartTime = System.currentTimeMillis();
		//urlList.stream().forEach(e -> BrokenLink(e)); // Scequence Mode take more time compaire to Parllel Mode
		urlList.parallelStream().forEach(e -> BrokenLink(e));// -> This is called lamder 
		Long EndTime = System.currentTimeMillis();
		
		// parallelStream mode = total time taken = 2695 secs
		// Scequence  Mode  = total time taken    = 23239 secs
		
		System.out.println("Total Time Is Taken " + (EndTime-StartTime));
		
		driver.close();
	}
	
	public static void BrokenLink(String linkUrl) {

		try {
			URL url = new URL(linkUrl);
			HttpURLConnection hc = (HttpURLConnection) url.openConnection();
			hc.setConnectTimeout(5000);
			hc.connect();

			if (hc.getResponseCode() >= 400) {
				System.out.println(linkUrl + hc.getResponseMessage() +"This is a Broken Link");
			}
			else {
				System.out.println(linkUrl + "-->>" + hc.getResponseMessage());
			}
		} catch (Exception e) {

		}

	}

}
