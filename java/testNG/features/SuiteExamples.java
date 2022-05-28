package testNG.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {
	
	WebDriver driver;
	long startTime;
	long endTime;

    @BeforeSuite
	private void launchBrowser() {

    	startTime = System.currentTimeMillis();
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\Driver\\chromedriver.exe");

		 driver = new ChromeDriver();
	
	}
	
	@Test
	private void opengoogle() {
		driver.get("https://www.google.co.in/");

	}

	@Test
	private void youtube() {
		driver.get("https://www.youtube.com/");
	}
	
	@AfterSuite
	private void closeBrowser() {	
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken :"+totalTime);
		
	}
	
	
	










}
