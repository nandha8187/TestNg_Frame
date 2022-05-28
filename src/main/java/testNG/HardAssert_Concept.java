
package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Concept {

	
	     @Test
	     private void username() {
	    	 
	    	 String exp_Username ="Starc";

	    	 String actual_Username ="Starc";
	    	 
	    	 Assert.assertEquals(actual_Username, exp_Username);
	    	 
	    	 System.out.println("Assert Validation");
	    	 
	    			 
		
	    	 
	    	 
	    	 
		}
	
	
	
	
	
	
	
	
	
}
