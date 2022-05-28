
package testNG;

import org.testng.annotations.Test;

public class Excepted_Exception_Methods {

	
	@Test(expectedExceptions = ArithmeticException.class)
	private void student() {
	
	    int a= 0;
	   
	    System.out.println(5/2);
	
	    System.out.println("Display output");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
