package testNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsEx {
	WebDriver driver;

	@Test
	public void testpre() throws InterruptedException {

		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		driver = new EdgeDriver();

		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(4000);
		String expectedurl="https://www.face";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "both Urls not macthed");
	}

	@Test(dependsOnMethods = "testpre")
	public void testpro() {
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("FaceBook URL verification completed");
		} else {
			System.err.println("titles were not matched");
		}
		driver.close();
	}

}
