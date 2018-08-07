package WebDriverDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Another way of the passing values to test annotation 
//Module 8 slide number 4 and concept: Parameters with Data Providers

public class DataProvider4_MultipleParameters {
	@Test(dataProvider="regdetails")
	  public void recdata(String fname,String lname,String loc ) {
		  System.out.println("First Name :"+fname);
		  System.out.println("Last Name :"+lname);
		  System.out.println("Location :"+loc);
	  }
	  
	  @DataProvider(name="regdetails")
	  public Object[][] dpmethod()
	  {
		  return new Object[][] {
			  {"Rohit","R","INDIA"},
			  {"DAVID","D","USA"}
		  };
	  }
}

//https://www.youtube.com/watch?v=Bl3MKWBbA8s
	
	
