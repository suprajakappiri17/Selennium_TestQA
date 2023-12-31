package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTAbWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);
		//TC-1 create a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		
		//Tc-2 create a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
	}

}
