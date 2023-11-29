package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe"); // webdriver.chrome.driver
		WebDriver driver = new EdgeDriver(); // new ChromeDriver()

		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);

		// manage the window to maximize
		driver.manage().window().maximize();

		// TC 3 -click on Sign up for Facebook link then it will move to signup page
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(3000);

		// TC - 4 click on Learn more
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(3000);

		// TC - 5 get the window handles
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs);

		// shifting from 0th tab to 1st tab
		driver.switchTo().window(tabs.get(1)); // 1st tab active
		Thread.sleep(3000);

		// TC - 6 click on Using Facebook
		driver.findElement(By.linkText("Using Facebook")).click();
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);

		// shifting from 1th tab to 0st tab
		driver.switchTo().window(tabs.get(0)); // 0th tab active
		Thread.sleep(3000);

		// TC - 6 close the browser
		driver.close();

	}

}
