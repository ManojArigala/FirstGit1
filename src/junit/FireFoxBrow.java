package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FireFoxBrow {
	 static WebDriver d;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
	  d= new FirefoxDriver();
	 d.manage().window().maximize();
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		d.quit();
	}


	 @Test
		void google() throws InterruptedException {
			 
			d.get("https://www.google.com/");
			Thread.sleep(2000);
			d.navigate().to("https://www.youtube.com/");
			Thread.sleep(2000);
			 
		
		}
		@Disabled
		 @Test
		 void facebook() throws InterruptedException {
			 d.get("https://www.facebook.com/");
				Thread.sleep(2000);
				 d.navigate().to("https://www.facebook.com/");
					Thread.sleep(2000);
		 }
}
