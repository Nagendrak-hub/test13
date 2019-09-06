package javaPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataProvider2 {
	WebDriver driver;

	void BrowserLaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://in.ebay.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("nagendarreddykaipa@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("N9985645304");
		driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
		driver.findElement(By.xpath("//a[text()=' Help & Contact']")).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
    	/*WebElement element = driver.findElement(By.xpath("//span[text()='Returns & Refunds']"));
		 je.executeScript("arguments[0].scrollIntoView(true);", element);*/
		je.executeScript("scroll(0, 250);");
		// driver.findElement(By.xpath(xpathExpression))

		driver.findElement(By.xpath("//span[text()='Returns & Refunds']")).click();
		je.executeScript("scroll(0, 250);");
		driver.findElement(By.xpath("//a[text()='Returning Items']")).click();
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//span[text()='Call us']")).click();
			Thread.sleep(2000);
			je.executeScript("scroll(0, 250);");
			List<WebElement> ele1 = driver.findElements(By.tagName("a"));
			System.out.println(ele1.size());
			for(int i=0;i<=ele1.size();i++) {
				System.out.println(ele1.get(i).getText());
				if(ele1.get(i).getText().equals("Policies")) {
					ele1.get(i).click();
					je.executeScript("scroll(0, 250);");
					driver.findElement(By.xpath("//a[text()='our policies']")).click();	
					//driver.navigate().to(title);
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='Home']")).click();	
					WebElement ele = driver.findElement(By.xpath("//*[@id='gh-ug']"));
					Actions action = new Actions(driver);
					action.moveToElement(ele).build().perform();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[text()='Sign out']")).click();

					
					
				}
			}
			
		
		
		
		
		// driver.findElement(By.xpath("//*[@id='channel_community']")).click();

		/*
		 * //je.executeScript("scroll(0, 1000);"); WebElement
		 * element1=driver.findElement(By.xpath("//a[text()='About eBay']"));
		 * je.executeScript("arguments[0].scrollIntoView(true);", element);
		 */

	}

	public static void main(String[] args) throws Exception {
		DataProvider2 dp2 = new DataProvider2();
		dp2.BrowserLaunch();
	}
}