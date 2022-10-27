package log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Log4jProgram1 {
	
	
	WebDriver driver;
  @Test
  public void f() {
	  Logger log= Logger.getLogger("LogLearning");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver.get("https://www.google.com/");
	  log.info("Enter google URL");
	  log.info("Enter date info");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

}
