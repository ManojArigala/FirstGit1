package advancefeatures;


import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class GetVerifyWebsite {
	
	
	
	WebDriver driver;
	@Test
	  public void verifyWebTitle() throws Exception {
		 driver.get("http://bharathnewsapp.com/");
		 Thread.sleep(3000);
		 
		
		 
		 String expTitle = "Tharoon | Manoj";
		 System.out.println("Expected Web Title is : "+expTitle);
		 
		 String actTitle = driver.getTitle();
		 System.out.println("Actual Web Title is :"+actTitle);
		 
		 Assert.assertEquals("Iphone", "Iphone");
		
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	  }

	

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
