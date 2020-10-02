package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.xml.dom.Wrapper;

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
	
}
