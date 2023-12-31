package takeDataFromExternal;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import com.google.common.collect.Table.Cell;

public class TestDataFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis= new FileInputStream("E:\\Eclipse_Workspace1\\MavenTest\\src\\test\\resources\\testdata.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheetAt(0);
		
		XSSFRow row=sh.getRow(0);
		
		XSSFCell cell = row.getCell(1);
		
		String URL=cell.getStringCellValue();
		
		//System.out.println("first row and first coulumn value is " + cValue);
		
		// TC - 1 lauch edge browser
				System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();

				// TC - 2 Go to the test URL
				driver.get(URL);
				Thread.sleep(4000);
				
				driver.close();	
	}

}
