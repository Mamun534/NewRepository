package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartShoping {
	
	WebDriver driver;
	
	public StartShoping(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement username() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		return username;
	}
	
	public WebElement password() {
		
		WebElement Password = driver.findElement(By.id("password"));
		return Password;
	}
	
	public WebElement loginButton() {
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		return LoginButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

