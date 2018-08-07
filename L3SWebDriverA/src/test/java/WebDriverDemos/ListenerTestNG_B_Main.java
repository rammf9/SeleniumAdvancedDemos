package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//https://www.youtube.com/watch?v=-a5aHd0gsGw

@Listeners(WebDriverDemos.ListenerTestNG_A.class)
public class ListenerTestNG_B_Main {
	WebDriver driverc;  
	
	//Making Test case pass
	@Test
  public void Titletestcase() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driverc=new ChromeDriver();
		driverc.manage().window().maximize();
		driverc.get("https://www.google.com");
		driverc.findElement(By.id("lst-ib")).sendKeys("facebook");
		
		
		driverc.findElement(By.name("btnK")).submit();
		Assert.assertEquals(driverc.getTitle(),"facebook - Google Search");
		driverc.close();
	
  }
	
	//Making test case fail
	
	@Test
	  public void Titletestcase2() {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driverc=new ChromeDriver();
			driverc.manage().window().maximize();
			driverc.get("https://www.google.com");
			driverc.findElement(By.id("lst-ib")).sendKeys("facebook");
			
			
			driverc.findElement(By.name("btnK")).submit();
			
			Assert.assertEquals(driverc.getTitle(),"facebook - Google Search1");
			driverc.close();
		
	  }
}
