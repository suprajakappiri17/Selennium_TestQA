package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe"); //webdriver.chrome.driver
		WebDriver driver = new EdgeDriver(); //new ChromeDriver()
		
		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);
		
		//manage the window to maximize
		driver.manage().window().maximize();
		
		
		//TC 3 navigate to URL "https://www.selenium.dev/"
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(5000);
		
		//tC 4 - nav7igate back
		driver.navigate().back();
		Thread.sleep(5000);
		
		//tC - 5 refresh browser window
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//TC - 6 navigate farward
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//TC - 7 close the browser
		driver.close();		

	}

}
