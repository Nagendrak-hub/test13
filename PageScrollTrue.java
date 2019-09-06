package javaPack1;

//import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollTrue {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.ebay.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[text()='Contact us']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
		driver.findElements(By.xpath("//a"));
		List<WebElement> element1 = driver.findElements(By.tagName("a"));
		System.out.println(element1.size());
		for (int i = 0; i < element1.size(); i++) {
			System.out.println(element1.get(i).getText());

		}
		// System.out.println( driver.findElements(By.tagName("a")));

		// driver.close();

	}
}
