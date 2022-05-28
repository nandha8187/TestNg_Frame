package testNG;

import org.testng.annotations.Test;

public class Grouds_Of_Group {

    @Test(groups = "TENNIS")
	private void nadal() {

		System.out.println("THE GOAT RED SOIL... ");

	}

    @Test(groups ="CRICKET")
	private void kohli() {

		System.out.println("KING KOHLI");

	}

    @Test(groups = "FOOTBALL")
	private void messi() {

		System.out.println("LEGEND...");   

	}

    @Test(groups = "TENNIS")
	private void feaderer() {

		System.out.println("RISING STAR");

	}

    @Test(groups ="CRICKET")
	private void abd() {

		System.out.println("Mr.360...");
	}

    @Test(groups = "FOOTBALL")
	private void ronaldo() {
		
		System.out.println("aggeresion....");
		
		
	}




}
