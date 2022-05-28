package testNG;

import org.testng.annotations.Test;

public class Invocation_Method {



	@Test
	private void dhoni() {

		System.out.println("Mr.cool.....");

	}

	@Test(invocationCount = 3)
	private void raina() {

		System.out.println("Chinna thala..........");

	}

	@Test
	private void jadu() {
	
		System.out.println("Sword celebration...");
		
	}
	






}
