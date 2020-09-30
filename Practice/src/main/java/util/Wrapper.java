package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper {
	

	public void launchBrowser(WebDriver driver)
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anandhan\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmreports.com/bmrs/");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']//p[contains(text(),'Balancing')]")).click();
		
}
}
