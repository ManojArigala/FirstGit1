package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SirCode {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
	/*	driver.findElement(By.id("edit-name")).sendKeys("manoj");   // id
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello@1234");   // name
		Thread.sleep(2000);
		//driver.findElement(By.className("form-submit")).click();   // className
		
	//	driver.findElement(By.cssSelector("input.form-submit")).click(); // cssSelector
		driver.findElement(By.cssSelector(".form-submit")).click();      // cssSelector
	
		driver.findElement(By.linkText("Photos")).click();		// linkText
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Greater")).click();  // partialLinkText
				
		*/
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number Of Links in HydReport Site :"+totallinks.size());
	}

}