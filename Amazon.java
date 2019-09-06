package pOIpack;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.deploy.config.SecuritySettings;

public class Amazon {
	WebDriver driver;
	WebElement element;
	Actions action;

	void test() throws Exception {
		//File f = File("C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\AmazonSheet.xlsx");
		/*FileInputStream fis = new FileInputStream("C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\AmazonSheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);*/

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// List<WebElement> element1 = driver
		// .findElements(By.xpath("//div[@class='crwProductDetail']/div[@class='crwTitle']/a"));
		// List<WebElement> element2 = driver
		// .findElements(By.xpath("//div[@class='crwPrice']/span[@class='crwActualPrice']/span"));
		 Map<Float, String> map = new TreeMap<>();
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='crwProductDetail']"));

		for (int i = 0; i < products.size(); i++) {
			String s1 = products.get(i).findElement(By.xpath("./div[@class='crwTitle']/a")).getText();
			String s2 = products.get(i)
					.findElement(By.xpath(".//div[@class='crwPrice']/span[@class='crwActualPrice']/span")).getText();
     String s3=s2.replace(",","");
      
    Float f=new Float(s3);
     map.put(f, s1);
     
  
    
			//System.out.println("Devise= " + s1 + "Price= " + s2);
		//	sheet.getRow(i).createCell(i + 1).setCellValue(s1);
			//FileOutputStream fos = new FileOutputStream(fis);
		//	wb.write(fos);
		}
		System.out.println(map);

		// int count2 = element2.size();
		// System.out.println(count2);
		// int count = element1.size();
		// System.out.println(count);
		// for (int i = 0; i < count; i++) {
		// String s1 = element1.get(i).getText();
		// for (int j = 0; j <= i; j++) {
		// String s2 = element2.get(i).getText();
		// System.out.println("Devise= " + s1 + "Price= " + s2);
		// }
		// }

	}
	public static void main(String[] args) throws Exception {
		Amazon am = new Amazon();
		am.test();

	}

}
//// div[@class='crwTitle']/a