package takeDataFromExternal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertiesEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				"E:\\Eclipse_Workspace1\\MavenTest\\src\\test\\resources\\testdata.properties");
		// Properties //load
		Properties pro = new Properties();
		pro.load(fis);

		String URL = pro.getProperty("myUrl");    //https://www.facebook.com
		System.out.println("my URL is  :   " + URL);

		// TC - 1 lauch edge browser
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// TC - 2 Go to the test URL
		driver.get(URL);
		Thread.sleep(4000);
		
		
		//Verification point to check whether you hvae opned correct URL not
		String expectedurl = "https://www.facebook.com/login.php";
		String actualurl=driver.getCurrentUrl(); //https://www.facebook.com
		if(expectedurl.equals(actualurl))
		{
			System.out.println("You have opened correct URL");
		}else {
			System.err.println("you hvae opned incorrect URL");
		}

		driver.close();

	}

}
