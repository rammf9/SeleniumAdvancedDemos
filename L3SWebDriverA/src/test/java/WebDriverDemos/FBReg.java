package WebDriverDemos;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FBReg {
	WebDriver driverc;
  @Test
  public void fbregistrationscript() {
	  driverc.get("https://www.google.com");
	  driverc.findElement(By.id("lst-ib")).sendKeys("facebook");
	  //driverc.findElement(By.xpath("//input[@value='Google Search']")).submit();
	  driverc.findElement(By.name("btnK")).submit();
	  Assert.assertEquals(driverc.getTitle(),"facebook - Google Search");
	  
	  driverc.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
	  
	 //if(driverc.getPageSource().contains("anncnc"))
	  if(driverc.getPageSource().contains("Create an account"))
	  {
	 
		  driverc.findElement(By.name("firstname")).sendKeys("Hello");
		  
		  

		  driverc.findElement(By.name("lastname")).sendKeys("Facebook");
		  
		  driverc.findElement(By.id("u_0_o")).sendKeys("9876543210");
		  
		  driverc.findElement(By.id("u_0_v")).sendKeys("Secret");
		  
		  Select day=new Select(driverc.findElement(By.name("birthday_day")));
		  day.selectByVisibleText("2");
		  
		  Select month=new Select(driverc.findElement(By.name("birthday_month")));
		  month.selectByIndex(2);
		  
		  Select year=new Select(driverc.findElement(By.name("birthday_year")));
		  year.selectByVisibleText("2010");
		  //Gender selection
		  //driverc.findElement(By.id("u_0_9")).click();
		  driverc.findElement(By.id("u_0_a")).click();
		  
		  //driverc.findElement(By.id("u_0_11")).click();
		  
		  
	  }
	  else
	  {
		  System.out.println("Text is not present");
	  }
	 
  }
  
  @BeforeMethod
  public void browserlaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driverc=new ChromeDriver();
	  driverc.manage().window().maximize();
  }
  
  @AfterMethod
  public void closebrowser() {
	  	//driverc.close();
  }
  
}
