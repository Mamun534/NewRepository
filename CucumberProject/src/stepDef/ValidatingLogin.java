package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidatingLogin {
	
	
	WebDriver driver;

	@Given("^user in the login page$")
	public void user_in_the_login_page() throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",		
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@After
	public void EndTest() {
		
		driver.close();
	}
	@When("^user enter right username$")
	public void user_enter_right_username() throws Throwable {

	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("^users enter right password$")
	public void users_enter_right_password() throws Throwable {

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("^users click on the login button$")
	public void users_click_on_the_login_button() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {

		System.out.println("User Are SuccessFully Loged In");
	}

	@When("^user enter wrong username$")
	public void user_enter_wrong_username() throws Throwable {

		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	}

	@When("^users enter wrong password$")
	public void users_enter_wrong_password() throws Throwable {

		driver.findElement(By.id("password")).sendKeys("secret1_sauce");
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {

		System.out.println("user Are Not Able to Loged In");
	}

}
