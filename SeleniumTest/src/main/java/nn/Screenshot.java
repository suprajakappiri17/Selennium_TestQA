package nn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destPath="E\\Eclipse_Workspace1\\SeleniumTestScreenshots/s1.png";
		try {
		FileHandler.copy(src, new File(destPath));
		}catch(IOException e) {
			System.err.println("unable to save the screenshot file");
		}
		driver.close();

	}

}
