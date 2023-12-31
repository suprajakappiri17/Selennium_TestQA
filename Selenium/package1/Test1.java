package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

//import java.util.concurrent.TimeUnit;//import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Supraja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Siri");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@abc.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");
		String atitle=driver.getTitle();
		System.out.println("Actual tile is : "+atitle);
		String etitle = "Sign up for Facebook | Facebook";
		if (etitle.equals(atitle))
		{
			System.out.println("True");
		}
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
		driver.quit();

	}

}
