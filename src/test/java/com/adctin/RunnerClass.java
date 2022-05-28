package com.adctin;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base_class.Base_Class;
import com.helper.Page_Object_Manager;
import com.pom.Book_Hotel;
import com.pom.Booking_Confiration1;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.pom.User_Detail;

public class RunnerClass extends Base_Class {

	public static WebDriver driver = Browser_config("chrome");

	public static Page_Object_Manager pom = new  Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(RunnerClass.class);

	public static String path="C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Testcase---Hotel booking.xlsx";

	public static ExtentReports reports;

	public static ExtentTest test;

	public static ExtentSparkReporter spark_reporter;

	@BeforeTest
	private void report_generation() {

		spark_reporter = new ExtentSparkReporter("C:\\Users\\ADMIN\\eclipse-workspace\\TestNG_22\\Reports\\Extent_Report.html");

		reports = new ExtentReports();

		reports.attachReporter(spark_reporter);

	}



	@AfterTest
	private void flush() {

		reports.flush();

	}



	@Test
	private void browser() {

		PropertyConfigurator.configure("log4j.properties");

		getUrl("https://adactinhotelapp.com");	

		log.info("Url launch");

	}

	@Test
	private void credentials() {

		inputKeys(pom.get_Instance_ud().getUsername(),"nandha619");

		inputKeys(pom.get_Instance_ud().getPassword(),"RQ7221");

		clickOnElement(pom.get_Instance_Login().getLogin_Btn());

		close();
	}


}