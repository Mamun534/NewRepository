package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartShoping {
	
	WebDriver driver;
	StartShoping ss;

	
	@Before
	public void configureSetUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	
	@Given("^user enter the user name$")
	public void user_enter_the_user_name() throws Throwable {
		
		
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	}

	@When("^user able to click on login button$")
	public void user_able_to_click_on_login_button() throws Throwable {
	}

	@Then("^user able to home page$")
	public void user_able_to_home_page() throws Throwable {
	}

}
