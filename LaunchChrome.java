package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}

	public static void main(String[] args) {
		LaunchChrome lc=new LaunchChrome();
		lc.test();
	}  
}
