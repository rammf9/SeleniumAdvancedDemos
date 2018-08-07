package WebDriverDemos;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	 
	 
  @Test
  public void metho1() throws InterruptedException {
	  for(int i=1;i<=10;i++) {
		  System.out.println("Method 1 i value :"+i);
		 Thread.sleep(20);
	  }
  }
  @Test
  public void metho2() throws InterruptedException {
	  for(int i=100;i<=110;i++) {
		  System.out.println("Method 1 i value :"+i);
		  Thread.sleep(20);
	  }
  }
  
//<suite name="Suite" parallel="methods" thread-count="2">
  //for each method one thread will be created,parallel methods means methods will be executed parallel not classes.. 
	
	
}
