package javaPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;

	@Test(dataProvider = "test")
	public void test(String firstname, String surname, String mobile ) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surname);
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys(mobile);
	}

	@DataProvider(name = "test")
	public String[][] getData() {
		String[][] ob = new String[2][3];
		ob[0][0] = "Rana";
		ob[0][1] = "Nagendar";
		ob[0][2] = "998564";
		ob[1][1] = "998564";
		/*
		   ob[2][0]="Nagendar";
		   ob[2][1]="Nagendar";
		 */

		return ob;
	}
}
