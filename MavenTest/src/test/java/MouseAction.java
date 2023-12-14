import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {

		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		//TC-3 create Actions class
		Actions actions=new Actions(driver);
		
		//click operation
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		actions.click(login).build().perform();
		Thread.sleep(4000);
		
		//Right click operation
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		actions.contextClick(email).build().perform();
		Thread.sleep(4000);
		
		//Tc -4 close the browser
		driver.close();

	}

}
