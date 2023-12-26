package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEx {

	public static void main(String[] args) throws InterruptedException {
		// TC - 1 lauch edge browser
				System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();

				// TC - 2 Go to the test URL
				driver.get("https://www.facebook.com/login.php");
				Thread.sleep(4000);
				
				//Take a screenshot
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String destinationpath = "E:\\Eclipse_Workspace1\\MavenTest\\src\\test\\resources\\Screenshots";
				try {
			FileHandler.copy(src, new File(destinationpath));
				}
				catch(IOException ex)
				{
					System.out.println("not able to save the file");
					System.err.println("not able to save the file");
				}
			
			//CLose the browser
			driver.close();
				
				

	}

}
