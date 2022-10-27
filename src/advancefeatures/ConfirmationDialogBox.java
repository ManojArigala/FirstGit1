package advancefeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ConfirmationDialogBox {
	WebDriver driver;
	  @Test
	  public void clickonCancelButtonWindow() throws InterruptedException {
		  driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		  Thread.sleep(9000);
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/article/div/div[1]/div/div/button")).click();
		  Thread.sleep(8000);
		  driver.switchTo().alert().accept(); // For pressed in Ok Button
//		  driver.switchTo().alert().dismiss();  // For pressed in Cancel Button
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
	  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
