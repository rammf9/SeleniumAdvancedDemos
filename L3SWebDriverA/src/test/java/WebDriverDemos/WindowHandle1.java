package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//How to transfer control from one window to another window
//Not working ... :)

public class WindowHandle1 {
@Test
public void testcase1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driverc=new ChromeDriver();
	driverc.manage().window().maximize();
	driverc.get("https://netbanking.hdfcbank.com/netbanking/");
	Thread.sleep(2000);
	String Parentwindowid= driverc.getWindowHandle();
	System.out.println("Parent window id  :"+Parentwindowid);

	driverc.findElement(By.linkText("Privacy Policy")).click();
	for(String subwindow:driverc.getWindowHandles()) {
		driverc.switchTo().window(subwindow);
		System.out.println("Sub Window id:"+subwindow);
	}
}
}
