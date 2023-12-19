package parallelExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
	WebDriver driver;

  @BeforeMethod
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
	  
	//click on forgot pwd  
  }
  
  
  @Test
  public void testcase3() {
	  //click on Sign up for Facebook and complete the signup
	  
	  
  }
  
  @AfterMethod
  public void afteremthod() {
		driver.close();
	  
  }
}

