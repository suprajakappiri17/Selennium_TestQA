package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookRe {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Supraja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Siri");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@abc.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");

	}

}
