package dataProviderCo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// TC - 2 Go to the test URL
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		
		String expectedTitle = "Log in to Facebook";
		System.out.println("expected title is "+expectedTitle);
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		
		
		// verifcation point 
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("you have opened correct URL  ie facebook");
		}
		else {
			System.err.println("you have opnded incorrect URL");
		}
		
		driver.close();
	}

}
