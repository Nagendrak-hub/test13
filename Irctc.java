package ExcellSheets;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Irctc {
	WebDriver driver;
	
void test() throws Exception {
	Robot r= new Robot();
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	/*ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");*/
	//driver.get("http://contents.irctc.co.in/en/IRCTC_andriod_App.html");
	driver.navigate().to("http://contents.irctc.co.in/en/IRCTC_andriod_App.html");
	
	driver.findElement(By.xpath("//a[text()='Home']")).click();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().window().maximize();
	/*Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Home']")).click();*/
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("IRCTC Next Generation eTicketing System")) {
		Thread.sleep(5000);
	//String parentWinHandle = driver.getWindowHandle();
	//Set<String> winHandles = driver.getWindowHandles();
		//System.out.println(winHandles);
		//driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("KACHEGUDA - KCG");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("KURNOOL CITY - KRNT");
		driver.findElement(By.xpath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
	    driver.findElement(By.xpath("//button[text()='Find trains']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("scroll(0, 1500);");
	   // List<WebElement> element = driver.findElements(By.tagName("//a"));
	    Thread.sleep(5000);
	    List<WebElement> element = driver.findElements(By.xpath("//span[	"
	    		+ "@class='trainName']"));
	       Thread.sleep(5000);
		int  st= element.size();
		System.out.println(st);		
		driver.findElement(By.xpath("//span[text()='Next Day']")).click();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);      
	js.executeScript("scroll(0, 1500);");
	driver.findElement(By.xpath("(//button[@id='check-availability'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[text()=' Book Now'])[1]")).click();
	driver.findElement(By.xpath("//a[@class='nav-link']")).click();
	ChromeOptions options1 = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
		driver.findElement(By.xpath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]")).click();
	}else {
		System.out.println("executing esle");
		driver.get("https://www.redbus.in/bus-tickets/");
		Actions ac= new Actions(driver);
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("Kurnool");
		ac.sendKeys(Keys.CONTROL.TAB);
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Kukatpally, Hyderabad");
		ac.sendKeys(Keys.CONTROL.TAB);
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).sendKeys("15-Aug-2019");
		ac.sendKeys(Keys.CONTROL.TAB);
		driver.findElement(By.xpath("//button[@class='search-btn searchBuses']")).click();
		driver.findElement(By.xpath("//div[text()='Show buses']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println(element.size());
		
	}
	
}
	
	public static void main(String[] args) throws Exception {
		Irctc ir = new Irctc();
		ir.test();
	}

}
