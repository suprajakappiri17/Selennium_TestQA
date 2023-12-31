package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2 extends Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Using Facebook")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(0));
		driver.close();
	}

}
