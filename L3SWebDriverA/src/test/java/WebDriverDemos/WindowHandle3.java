package WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Storing & Accessing  window ids in variable using set and array concepts

public class WindowHandle3 {
  @Test
  public void Testcase1() {
	  WebDriver driverc=new ChromeDriver();
		driverc.manage().window().maximize();
		driverc.get("https://www.naukri.com/");
		String parentid = driverc.getWindowHandle();
		
		System.out.println("Parent windowid"+parentid);
		
		System.out.println("Number of Sub windows:"+driverc.getWindowHandles().size());
		
	  
  }
}
