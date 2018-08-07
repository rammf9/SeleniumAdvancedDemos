package WebDriverDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Example for Module 8 Slide 3 ,concept: Data provider and passing single value as parameter
public class DataProvider1 {
  @Test(dataProvider="regdetails")
  public void recdata(String name) {
	  System.out.println("Name :"+name);
  }
  
  @DataProvider(name="regdetails")
  public Object[][] dpmethod()
  {
	  return new Object[][]
	{
		  {"Rohit"},
		  {"David"} 
	 };
  }
}
  
