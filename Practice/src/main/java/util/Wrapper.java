package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper extends BaseClass {
	
	
	public void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anandhan\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bmreports.com/bmrs/");
		
	}
	


	
	public static void clickonElement(WebElement element) {
		element.click();
	}
	
	
}
