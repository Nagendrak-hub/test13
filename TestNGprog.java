package javaPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGprog {
	WebDriver driver;

	@BeforeSuite
	void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass
	void launchapplication() {
		driver.navigate().to("https://in.ebay.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

	@BeforeMethod
	void Login() {
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("nagendarreddykaipa@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("N9985645304");
		driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
		System.out.println(driver.getTitle());
	}

	@Test
	void addCart() throws Exception {
		driver.findElement(By.xpath("//div[@id='destinations_list1']/ul/li[4]")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"w8-xCarousel-x-carousel-items\"]/ul/li[2]/a[@class='b-guidancecard__link b-guidancecard__link--noimg']"))
				.click();
		driver.findElement(By.xpath("//span[text()='Computer Software']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Antivirus & Security Software']")).click();
		driver.findElement(By.xpath(
				"//*[@class='b-guidancecard__link']/div[@class='b-guidancecard__img']/following-sibling::p[text()='Norton']"))
				.click();
		driver.findElement(By.xpath("//p[text()='Microsoft Windows 10']")).click();

		driver.findElement(By.xpath("(//h3[@class='s-item__title'])[1]")).click();
		Thread.sleep(3000);
		System.out.println("working");
		driver.findElement(By.xpath("//*[@class='item-primary-cta']/div/div[2]/div/a")).click();

		System.out.println(driver.getTitle());
		WebElement ele = driver.findElement(By.xpath("//*[@id='gh-ug']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();

		driver.quit();
	}

}
