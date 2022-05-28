package testNG.features;

import org.testng.annotations.Test;

public class GroupingExample {

	
	@Test(groups="Apple")
	private void apple1() {
	
		System.out.println("Apple testing");
	}
	@Test(groups ="Apple")
	private void apple2() {
	
		System.out.println("Apple testing");
	}
	@Test(groups ="Moto")
	private void moto1() {
	
		System.out.println("moto testing..");
	}
	@Test(groups ="Moto")
	private void moto2() {
	
	   System.out.println("moto testing....");
	}
	
	@Test(groups="Vivo")
	private void vivo1() {
	
		System.out.println("vivo testing.....");
	}
	@Test(groups="Vivo")
	private void vivo2() {


		System.out.println("vivo testing.....");
	}
	@Test(groups="lenovo")
	private void lenovo1() {
	
		System.out.println("lenovo1...........");
	}
	@Test(groups="lenovo")
	private void lenovo2() {
	
		System.out.println("lenovo2.......");
	}
	
}
