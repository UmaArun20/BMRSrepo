package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.xml.dom.Wrapper;

public class BaseClass extends Wrapper{
	
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		Wrapper ws = new Wrapper();
		ws.launchBrowser(driver);
		
	}
	
	
}
