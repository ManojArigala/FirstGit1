package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	static WebDriver  driver;
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}

