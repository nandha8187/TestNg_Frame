package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

   
	@Test
    private void username() {
   	 
   	 String exp_Username ="Starc";

   	 String actual_Username ="Starc123";
   	
   	 SoftAssert soft = new SoftAssert();
   	 
   	 soft.assertEquals(actual_Username, exp_Username);
   	 
   	 System.out.println("Assert Verification");
	
	}
	
	
	
	
	
	
	
}
