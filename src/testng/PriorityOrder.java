package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PriorityOrder {
	 WebDriver driver;
	 
		
	  @Test (enabled=false)
	  public void google() {
		  driver.get("https://www.google.co.in/");
		   
	  }
	
	  
	  @Test(enabled=true)
	  public void Apple() {
		  driver.get("https://www.apple.com/");
	  }
	  
	  @Test(priority=1)
	  public void Amazon() {
		  driver.get("https://www.amazon.in/");
	  }
	  @Test
	  public void instagram() {
		  driver.get("https://www.instagram.com/");
		  
	  }
	  @Test (priority=2)
	  public void gmail() {
		  driver.get("https://mail.google.com/mail/u/0/#inbox");
		 
		  
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
