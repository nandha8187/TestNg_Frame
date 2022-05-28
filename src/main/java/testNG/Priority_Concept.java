
package testNG;

import org.testng.annotations.Test;

public class Priority_Concept {


	@Test(priority = 1)
	private void username() {

		System.out.println("colleage");
	}


	@Test(priority = 0)
	private void Hsc() {

		System.out.println("Hssc");
	}

	@Test(priority = -1)
	private void sslc() {

		System.out.println("high school");
	}











}
