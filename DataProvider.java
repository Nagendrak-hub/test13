package javaPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;

	@BeforeMethod
	void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@org.testng.annotations.DataProvider(name = "TestData")
	public Object[][] test1() {
		Object[][] ob = new Object[2][3];
		ob[0][0] = "nagendra";
		ob[0][1] = "nagendar";

		ob[1][0] = "nagendra1";
		ob[1][1] = "nagendar2";
		ob[2][0] = "nagendra3";
		ob[2][1] = "nagendar4";
		return ob;
	}

	@Test(dataProvider = "TestData")
	void test2(String Username, String Password) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	}

}
