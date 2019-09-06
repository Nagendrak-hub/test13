package ExcellSheets;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;

	@Test
	public void f() throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\dev03\\eclipse-workspace\\SampleJava\\SampleTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();

		System.out.println("No of rows are: " + rowCount);

		for (int i = 1; i < sheet.getLastRowNum(); i++) {

			String username = sheet.getRow(i).getCell(0).getStringCellValue();

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

			Thread.sleep(5000);

			String password = sheet.getRow(i).getCell(1).getStringCellValue();

			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		}

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	@AfterTest
	public void afterTest() {

		driver.quit();

	}

}
