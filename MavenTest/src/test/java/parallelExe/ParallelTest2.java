package parallelExe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
	WebDriver driver;

	@BeforeClass
	public void beforemethod() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);
	}

	@Test
	public void testcase1() throws InterruptedException {
		
		String title = driver.getTitle(); // String title=facebook
		System.out.println(title);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();

	}

	@Test
	public void testcase2() {
		// click on forgot pwd
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();

	}

	@Test
	public void testcase3() {
		// click on sign up
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();

	}

	@AfterClass
	public void afteremthod() {
		driver.close();

	}
}
