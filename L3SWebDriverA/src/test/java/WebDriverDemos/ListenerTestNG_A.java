package WebDriverDemos;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//https://www.youtube.com/watch?v=-a5aHd0gsGw
public class ListenerTestNG_A  implements ITestListener{
	ExtentReports e;
	ExtentTest t;
	
/*
	public void onFinish(ITestContext result) {
		System.out.println("onFinish test case :"+result.getName());
		
	}

	public void onStart(ITestContext result) {
		System.out.println("onStart test case :"+result.getName());
		
	}

*/
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage test case :"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure test case :"+result.getName());
	 
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped test case :"+result.getName());
		
	}
/*
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart test case :"+result.getName());
		
	}
*/
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess test case :"+result.getName());
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		e.endTest(t);
		e.flush();
		
	}

	public void onStart(ITestContext arg0) {
		e = new ExtentReports("C:\\Users\\ramanjaneyulu.aki\\Selenium_Lateral\\L3SWebDriverA\\test-output\\myreport.html");
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		t=e.startTest("test started");
	}

}
