package testNG.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParrllelTestingEx {

	@Test
	private void openGoogle() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

       driver.get("http://www.google.co.in");

       driver.quit();

	}

	@Test
	private void openBing() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.bing.com");

		   driver.quit();
		
	}










}
