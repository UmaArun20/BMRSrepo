package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjects.B1780Page;

	public class B1780_Page_Test{
	    static WebDriver driver;
	
		@Test
		public void OpenDisBsadAndViewgTable() throws InterruptedException {
	
			
			B1780Page B1780Page = PageFactory.initElements(driver, B1780Page.class);
					 
			B1780Page.clickOnDisbsad();
			Thread.sleep(3000);
			B1780Page.verifyHeader();
			Thread.sleep(3000);
		    B1780Page.clickOnViewbtn();
		    Thread.sleep(3000);
		
	}
	
}
