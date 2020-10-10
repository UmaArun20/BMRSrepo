package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.xml.dom.Wrapper;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	public static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		Wrapper ws = new Wrapper();
		ws.launchBrowser();
		
	}
	@AfterTest
	
		public void closeBrowser() {
			driver.quit();
			
	
	}
	
	@DataProvider(name="abc")
	public static String[][] iterateExcel() throws Exception{
		return Wrapper.getExcelData();
		
		
	}
	
}
