package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionLogin {
	WebDriver driver;
	
	@Given("User is present on Facebook login page")
	public void user_is_present_on_facebook_login_page() {
		
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
	    
	}

	@When("tiltle is Login in to Facebook")
	public void tiltle_is_login_in_to_facebook() throws InterruptedException {
		String expectedTitle="Log in to Facebook";
		String actualTile=driver.getTitle();
		Assert.assertEquals(actualTile, expectedTitle);
		Thread.sleep(4000);
	    
	}

	@Then("USer enter the valid {string} and {string}")
	public void u_ser_enter_the_valid_and(String string1, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string1);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(string2);
		Thread.sleep(4000);
	    
	}

	@Then("click on login button and logged in successfully.")
	public void click_on_login_button_and_logged_in_successfully() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(4000);
		driver.close();
	    
	}

}
