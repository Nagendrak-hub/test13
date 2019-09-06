package javaPack1;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenMultipleAccounts {
WebDriver driver;
@BeforeSuite
void test() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
}
@BeforeMethod
void faceebook()
{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
}
@Test
	void testcase1() throws Exception   {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9985645304");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9618380467");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		/*driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//Thread.sleep(6000);	*/
		}
@Test
void testcase2() throws Exception {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9493779630");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8106048649");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}  
@AfterMethod
void logout() throws Exception {
	driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//span[@class='_54nh'])[6]")).click();
	//driver.close();
}

}