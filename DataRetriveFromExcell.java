package ExcellSheets;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataRetriveFromExcell {
	WebDriver driver;

	void test() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("FACEBOOK");
		String un = sheet.getRow(1).getCell(1).getStringCellValue();
		String pw = sheet.getRow(1).getCell(2).getStringCellValue();
		String un1 = sheet.getRow(2).getCell(1).getStringCellValue();
		String pw1 = sheet.getRow(2).getCell(2).getStringCellValue();
		String un2 = sheet.getRow(3).getCell(1).getStringCellValue();
		String pw2 = sheet.getRow(3).getCell(2).getStringCellValue();
		System.out.println(un2);
		System.out.println(pw2);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		/*JavascriptExecutor exe=((JavascriptExecutor)driver);
		exe.executeScript("window.open()");*/
		driver.get("https://www.facebook.com");
		for (int i = 1; i < 2; i++) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//span[@class='_54nh'])[6]")).click();
			System.out.println(driver.getTitle());
			for (int j = 2; j > i; j++) {
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un1);
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw1);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("(//span[@class='_54nh'])[6]")).click();
				System.out.println(driver.getTitle());
				if (i == 1) {
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un2);
					driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw2);
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
					Thread.sleep(6000);
					driver.findElement(By.xpath("(//span[@class='_54nh'])[6]")).click();
					break;

				}
			}
		}
	}

	/*private JavascriptExecutor JavascriptExecutor(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public static void main(String[] args) throws Exception {
		DataRetriveFromExcell dr = new DataRetriveFromExcell();
		dr.test();
	}

}
