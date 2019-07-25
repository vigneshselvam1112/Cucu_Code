package Test_Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("user opens login portal")
	public void user_opens_login_portal() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_c2d.02.11\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("Clicks on singn button")
	public void clicks_on_singn_button() {
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("validate login success")
	public void validate_login_success() {
	
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}

}
