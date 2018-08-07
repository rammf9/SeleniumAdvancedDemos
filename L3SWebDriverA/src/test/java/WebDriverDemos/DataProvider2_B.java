package WebDriverDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//Example for Module 9 Slide 5 ,concept: Data provider in different class
public class DataProvider2_B {
	@DataProvider(name="regdetails")
	//static is mandatory when u r calling dataprovider from another class  
	public static Object[][] dpmethod()
	  
	  {
		  return new Object[][]
		{
			  {"Rohit"},
			  {"David"} 
		 };
	  }
}
