package advancefeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupAlert {
	
	WebDriver d;
	
  @Test
  public void f() throws InterruptedException {
	  d.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	  Thread.sleep(5000);
	  d.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  d.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
