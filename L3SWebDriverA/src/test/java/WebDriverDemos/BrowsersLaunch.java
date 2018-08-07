package WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowsersLaunch {
	WebDriver driverc;
	WebDriver driverge;
	WebDriver driverie;
  @Test
  public void BusinesslogicScript() {
	  //System.out.println("Write the script here later and understand the launching browsers and application");
	  driverc.get("http://www.google.com");
	 // driverge.get("http://www.google.com");
	//  driverie.get("http://www.google.com");
	  
  }
  
  @BeforeMethod
  public void browserlaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  driverc=new ChromeDriver();
	  driverc.manage().window().maximize();
	  /*
	  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	  driverge=new FirefoxDriver();
	  
	  System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
	  driverie=new InternetExplorerDriver();
	  */
  }
  
  @AfterMethod
  public void closebrowser() {
	  driverc.close();
	  //driverge.close();
	  //driverie.close();
  }
}
