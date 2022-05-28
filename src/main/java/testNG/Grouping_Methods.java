package testNG;

import org.testng.annotations.Test;

public class Grouping_Methods {

	@Test(groups = "csk players")
	private void MSD() {
		System.out.println("CSK COOL CAPTAIN");
	}
	@Test(groups = "rcb players")	
	private void KOHLI() {
		System.out.println("RCB KING KOHLI");

	}
	@Test(groups = "paltans player")
	private void ROHIT() {
		System.out.println("HITMAN SHARMA ");
	}
	@Test(groups = "rcb players")
	private void FAF() {
		System.out.println("RCB CAPTAIN");
	}

	@Test(groups = "csk players")
	private void JADU() {
		System.out.println("CSK SIR");
	}
	




}
