package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoElements {
	
		WebDriver driver;

		public SauceDemoElements(WebDriver driver) {

			this.driver = driver;
		}

		public WebElement getUserId() {

			WebElement username = driver.findElement(By.id("user-name"));
			return username;

		}

		public WebElement getPassword() {

			WebElement Password = driver.findElement(By.id("password"));
			return Password;

		}

		public WebElement LoginButton() {

			WebElement LoginButton = driver.findElement(By.id("login-button"));
			return LoginButton;
		}

		public WebElement wrongusername() {

			WebElement wronguser = driver.findElement(By.id("user-name"));
			return wronguser;
		}

		public WebElement wrongpassword() {

			WebElement wrongpassword = driver.findElement(By.id("password"));
			return wrongpassword;
		}

		public WebElement user_should_not_Login() {
			
			WebElement LoginButton = driver.findElement(By.id("login-button"));
			return LoginButton;
		}	
	}


