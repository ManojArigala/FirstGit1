package advancefeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PromptDialogBox {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  
	 /* 
	  driver.switchTo().alert().sendKeys("Tharoon");
	  driver.switchTo().alert().accept();
	  */
	  
	  Alert A=driver.switchTo().alert();
	  A.sendKeys("Tharoon & Manoj");
	  A.accept();
//	  driver.switchTo().alert().accept(); 
//	  
//	  Alert alt = driver.switchTo().alert();
//	  alt.sendKeys("Tharoon & Manoj");
//	  alt.accept();
	  
	  
	/*  driver.switchTo().alert().sendKeys("Tharoon");
	  driver.switchTo().alert().accept();
	*/  
	
	  
	 // driver.switchTo().alert().accept(); // For pressed in Ok Button
	//  driver.switchTo().alert().dismiss();  // For pressed in Cancel Button
	  

  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
