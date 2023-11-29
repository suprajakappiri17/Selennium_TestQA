package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//TC 1- lauch edge browser and navigate to facebook URL
				System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.facebook.com/login.php");
				
				//TC 2 -click on  Sign up for Facebook link then it will move to signup page
				driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
				Thread.sleep(5000);
				
				//TC - 3 select day drop down value
				Select day=new Select(driver.findElement(By.id("day")));
				day.selectByValue("20");
				Thread.sleep(5000);
				
				//TC - 4 select month drop down value
				Select month=new Select(driver.findElement(By.name("birthday_month")));
				month.selectByValue("8");
				Thread.sleep(5000);
				
				//TC - 5 select year drop down value
				Select year=new Select(driver.findElement(By.id("year")));
				year.selectByValue("2001");
				Thread.sleep(5000);
				
				//selectbyvisibletext
				//selectbyindex
				//automate male radio button
				//click on sign up button
				
				
				
				//close the browser
				driver.quit();
				
				

	}

}
