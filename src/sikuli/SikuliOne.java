package sikuli;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliOne {
	Screen s=new Screen();
  @Test
  public void f() throws FindFailed {
	  s.click("D:\\Lib\\Windows.PNG");
  }
  
  @BeforeTest
  public void beforeTest() {
  }

}
