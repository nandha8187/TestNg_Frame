package testNG;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 7000) 
	private void Browser_Execution() throws Throwable {

		
		Thread.sleep(2000);             // Browser launch
		
		System.out.println("Browser Launch");
		
        Thread.sleep(1000);             // url
        
        System.out.println("Url launch");
        
        Thread.sleep(2000);   //Data entered in the field
        
        System.out.println("Credentials Entered");
        
        Thread.sleep(1000);   //real static wait
     
        System.out.println("next page");
     
     
     
     
     
     
     }






	
	






}
