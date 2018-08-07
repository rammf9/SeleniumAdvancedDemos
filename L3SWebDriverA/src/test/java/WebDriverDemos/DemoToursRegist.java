package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoToursRegist {
	WebDriver driverc;
  @Test
  public void registrationmethod() {
	  driverc.get("http://newtours.demoaut.com/");
	  driverc.findElement(By.linkText("REGISTER")).click();
	  Assert.assertEquals(driverc.getTitle(),"Register: Mercury Tours");
	  
	  
	  driverc.findElement(By.name("firstName")).sendKeys("AccDemo");
	  driverc.findElement(By.name("lastName")).sendKeys("Limit");
	  driverc.findElement(By.name("phone")).sendKeys("1234567890");
	  driverc.findElement(By.name("userName")).sendKeys("AccDemo@gmail.com");
	  driverc.findElement(By.name("address1")).sendKeys("ATCC");
	  driverc.findElement(By.name("city")).sendKeys("India-Delhi");
	  driverc.findElement(By.name("state")).sendKeys("Delhi");
	  driverc.findElement(By.name("postalCode")).sendKeys("511111");
	  driverc.findElement(By.name("country")).sendKeys("INDIA");
	  driverc.findElement(By.id("email")).sendKeys("Accdemou");
	  driverc.findElement(By.name("password")).sendKeys("secret");
	  driverc.findElement(By.name("confirmPassword")).sendKeys("secret");
	  driverc.findElement(By.name("register")).click();
	  
  }
  
  @BeforeMethod
  public void applicationlaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driverc=new ChromeDriver();
	  driverc.manage().window().maximize();
	 
  }
  
  @AfterMethod
  public void closebrowser() {
	  //driverc.close();
  }
  
}
