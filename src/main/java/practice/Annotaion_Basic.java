package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaion_Basic {


	@BeforeSuite
	private void browserlanuch() {

		System.out.println("hi I am Nandha");
	}
    @BeforeTest
	private void name() {

		System.out.println("I from chennai");

	}
    @BeforeClass
	private void school() {
		// TODO Auto-generated method stub
 
    	 System.out.println("HELOOOO");
	}

    @BeforeMethod
	private void college() {
		// TODO Auto-generated method stub
    	System.out.println("I am the master");

	}
    @Test
	private void frnds() {
		// TODO Auto-generated method stub
    	System.out.println("am the intervert person");

	}

    @Test
    private void kovil() {
		// TODO Auto-generated method stub

    	System.out.println("I am the youg boy");
	}
    
    
    
    @AfterMethod
	private void family() {
		// TODO Auto-generated method stub

    	System.out.println("paaviiii");
	}


    @AfterClass
	private void passion() {
		// TODO Auto-generated method stub

    	System.out.println("goalllllll");
	}
    @AfterTest
	private void memories() {
		// TODO Auto-generated method stub

    	System.out.println("cotribute 10th mark");
	}
    @AfterSuite
	private void events() {
		// TODO Auto-generated method stub

    	System.out.println("Rko oooo");
	}




}
