package parallelExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest1 {
	WebDriver driver;

  @Test
  public void testcase1() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");  
		Thread.sleep(5000);
  }
  
  @Test
  public void testcase2() throws InterruptedException {
	  String title = driver.getTitle(); // String title=facebook
		System.out.println(title); 
		Thread.sleep(5000);
  }
  
  public void testcase3() throws InterruptedException {
	  driver.manage().window().maximize();
		Thread.sleep(5000);
	  
  }
  
  
  @Test
  public void testcase4() throws InterruptedException {
	  driver.manage().window().minimize();
		Thread.sleep(5000);
	  
  }
  
  @Test
  public void testcase5() {
		driver.close();
	  
  }
}

