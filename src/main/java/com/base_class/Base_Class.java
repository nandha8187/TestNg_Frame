package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {


	public static WebDriver driver;    //---------->null
	
	public static String value;     //-------------->null

	public static WebDriver Browser_config(String type) {


		if(type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		else if(type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "value");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void getUrl(String url) {

		driver.get(url);

	}	



	public static void clickOnElement(WebElement element) {

		//signin_Btn.click();

		element.click();

	}
	
	public static void inputKeys(WebElement element, String data) {

		//username.sendKeys(data);

		element.sendKeys(data);

	}

	public static void dropdown(String type,WebElement element,String value) {
		
		Select s = new Select(element);
		
		if(type.equalsIgnoreCase("byValue")) {
			
			s.selectByValue(value);
			
		}
		else if (type.equalsIgnoreCase("byText")) {
			
			s.selectByVisibleText(value);
		}
		
		else if (type.equalsIgnoreCase("byIndex")) {
			
			int index = Integer.parseInt(value);
			
			s.selectByIndex(index);		
	
		}
	}
	
	public static void takeScreenshot(String path) throws Exception{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(path);
		
		FileUtils.copyFile(source, destination);
		
		
	}
	
	public static void sleep(int seconds) throws Throwable {
		
		Thread.sleep(seconds);
		
	}
	
	
	public static void actionClass(String actionName, WebElement element) {
		
		Actions a = new Actions(driver);
		
		if (actionName.equalsIgnoreCase("moveto")) {
			
			a.moveToElement(element).build().perform();
			
		} else if(actionName.equalsIgnoreCase("clickon")) {
		
		    a.click(element).build().perform();
	
	    } else if(actionName.equalsIgnoreCase("doubleClick")) {
	    	
	        a.contextClick(element).build().perform();
	    
	    } else if(actionName.equalsIgnoreCase("click")) {
	    	
	    	a.click(element).build().perform();
	    	
	    }
		
}
		

	public static String particular_Data(String path, int row_Index, int cell_Index) throws IOException {
		
		File f =new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);            //Up casting
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(row_Index);
		
		Cell cell = row.getCell(cell_Index);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {
			
			value = cell.getStringCellValue();
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int val = (int) numericCellValue;
			
			value = String.valueOf(val);
		}
		return value;
				
			
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
		
	}
	
	public static void close() {
		
		driver.close();
		
	}




}