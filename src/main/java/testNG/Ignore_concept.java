package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {

	@Ignore
	@Test
	private void yorker() {

		System.out.println("BUMRAHHHHH");
	}

	@Test(enabled = false)
	private void testcricket() {

		System.out.println("THE WALL");
	}

	@Test(priority = 0)
	private void twenty20() {

		System.out.println("UNIVERSAL BOOS");
	}


	@Test(priority = -1)
	private void ODI() {

		System.out.println("THE KING KOHLI");
	}








}
