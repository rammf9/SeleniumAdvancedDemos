package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Example on Naukri websites and control other windows 
public class WindowHandle2 {
  @Test
  public void TestCase1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driverc=new ChromeDriver();
		driverc.manage().window().maximize();
		
		driverc.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parentid = driverc.getWindowHandle();
		
		System.out.println("Parent windowid"+parentid);
		
		System.out.println("Number of Sub windows:"+driverc.getWindowHandles().size());
		Thread.sleep(3000);
		
		driverc.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		driverc.getWindowHandles();
	 
		 
  }
}
