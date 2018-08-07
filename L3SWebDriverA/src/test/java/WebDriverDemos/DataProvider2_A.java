package WebDriverDemos;

import org.testng.annotations.Test;



//Example for Module 8 Slide 5 ,concept:Data provider in different class
//dataproviderclass is required bec dataprovider annotation is different location and extension should be .class only

public class DataProvider2_A {
	 @Test(dataProvider="regdetails",dataProviderClass=DataProvider2_B.class)
	  public void recdata(String name) {
		  System.out.println("Name :"+name);
	  }
}
