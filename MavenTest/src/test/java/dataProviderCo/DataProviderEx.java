package dataProviderCo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	WebDriver driver;
	
  @Test(dataProvider="testdata")
  public void pTest(String url) throws InterruptedException {
	  
	  System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.get(url);  
		Thread.sleep(5000);
		driver.close();
		
		
		
		
  }
  
  //https://www.facebook.com/login.php
  //https://www.selenium.dev/
  //https://www.flipkart.com/
  
  @DataProvider
  public Object[] testdata() //public int testdata() //public String testdata()
  {
	  Object[] arr = new Object[3];
	  arr[0] = "https://www.facebook.com/login.php";
	  arr[1] = "https://www.selenium.dev/";
	  arr[2] = "https://www.flipkart.com/";
	  return arr;
	
  
  }
}
