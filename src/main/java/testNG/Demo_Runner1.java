package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Runner1 {
	

	@Test(priority = -1)
	private void username() {
		
		 String expected_Username ="Starc123";

    	 String actual_Username ="Starc123";
    	  
    	 Assert.assertEquals(actual_Username, expected_Username);
	}
	
	@Test
	private void password() {
		
		 String expected_password ="Starc";

    	 String actual_password ="Starc123";
    	  
    	 Assert.assertEquals(actual_password, expected_password);

	
	}	
	
	
	

}
