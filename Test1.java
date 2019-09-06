package javaPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class Test1 {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://in.ebay.com");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    System.out.println(driver.getCurrentUrl());
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@class='carousel__pause']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@class='carousel__play']")).click();
    Thread.sleep(5000);
    Select se=new Select(driver.findElement(By.xpath("//select[@class='gh-sb gh-sprRetina']")));
    se.selectByVisibleText("Cameras & Photo");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    
  /* se.deselectByVisibleText("Cameras & Photo");
   se.selectByVisibleText("Jewelry & Watches");*/
    
    
    
    
  /*  WebElement element= driver.findElement(By.xpath("//*[@class='carousel__pause']"));
    Actions ac = new Actions(driver);
   ac.doubleClick(element).perform();*/
}
}
 