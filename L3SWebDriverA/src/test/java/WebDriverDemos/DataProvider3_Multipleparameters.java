package WebDriverDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3_Multipleparameters {
	@Test(dataProvider="regdetails")
	  public void recdata(String fname,String lname,String loc ) {
		  System.out.println("First Name :"+fname);
		  System.out.println("Last Name :"+lname);
		  System.out.println("Location :"+loc);
	  }
	  
	  @DataProvider(name="regdetails")
	  public Object[][] dpmethod()
	  {
		 Object [][] data=new Object[2][3];
		 data[0][0]="Rohit";
		 data[0][1]="M";
		 data[0][2]="INDIA";
		 
		 data[1][0]="DAS";
		 data[1][1]="K";
		 data[1][2]="USA";
		  
				 
		 return data;
	  }
}
