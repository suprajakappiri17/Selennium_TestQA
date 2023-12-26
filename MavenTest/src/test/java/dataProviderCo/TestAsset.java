package dataProviderCo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAsset {
	@Test
	public void assertEx() throws InterruptedException {

		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(4000);

		String expectedTitle = "Log in to Facebook123";
		String actualTitle = driver.getTitle();
		
		//verification point
		Assert.assertEquals(actualTitle, expectedTitle, "page title not macthed with the expected tile");
		
		driver.close();

	}
}
