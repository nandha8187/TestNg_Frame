package testNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	
	String s ="nandha";
	
	boolean value =false;
	

	@Test
	private void checkequal() {
	
		Assert.assertFalse(value,"This should not be true");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
