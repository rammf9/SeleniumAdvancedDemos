package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowsFrames1 {
  @Test
  public void windowsframes() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  WebDriver driverc=new ChromeDriver();
		driverc.manage().window().maximize();
			driverc.manage().window().maximize();
			driverc.get("C:\\WindowsFramesp.html");
			
			driverc.switchTo().frame("w3c");
			System.out.println(driverc.getTitle());
			
			driverc.findElement(By.linkText("SIGN-ON")).click();
			Thread.sleep(3000);
			
			//Switching to parent window 
			driverc.switchTo().defaultContent();
			//after changing to main page click on the content of the main web page
			driverc.findElement(By.linkText("Click here for Selenium manual")).click();
			Thread.sleep(5000);
			driverc.quit();
  }
}
