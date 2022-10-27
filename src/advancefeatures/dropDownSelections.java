package advancefeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dropDownSelections {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 
//	 new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]/option[104]"))).selectByValue("IN");
	  driver.findElement(By.xpath("//*[@id=\"text-13263966988\"]")).sendKeys("Tharun");
	  driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("Pullareddy");
	  driver.findElement(By.xpath("//*[@id=\"text-23732060291\"]")).sendKeys("pullareddytharun8@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"field-DVYLZM9QELAAq8K\"]")).sendKeys("7981234756");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"field-krP8MPeuzRrukdo\"]")).sendKeys("1-4-132,Sv college of engineering");
	  driver.findElement(By.xpath("//*[@id=\"field-2Ngu0gfcgyZYrFE\"]")).sendKeys("Tirupathi");
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517500");
	  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("India");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PK");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("IN");
	  driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("The dictionary defines automation as “the technique of making an apparatus, a process");
	  Thread.sleep(1000);
		 new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByIndex(3);
	  driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("D:\\New Text Document.txt");
	  driver.findElement(By.xpath("//*[@id=\"button-20216154383\"]")).click();
	  Thread.sleep(1000);
	
	
	 
//	 Thread.sleep(3000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://baalabharathi.com/upload-story/");

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	 
  }

}


//
////new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("India");
//	// new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PK");
//	 new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByIndex(3);
