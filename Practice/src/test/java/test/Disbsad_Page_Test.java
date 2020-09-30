package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjects.DisbsadPage;

	public class Disbsad_Page_Test{
	    static WebDriver driver;
	
		@Test
		public void OpenDisBsadAndViewTable() throws InterruptedException {
	
			
			DisbsadPage DPage = PageFactory.initElements(driver, DisbsadPage.class);
					 
			DPage.clickOnDisbsad();
			DPage.verifyHeader();
			Thread.sleep(3000);
		    DPage.clickOnCalender();
		    Thread.sleep(3000);
		    DPage.selectMonth();
		    Thread.sleep(3000);
		    DPage.selectYearOption();
		    Thread.sleep(3000);
		    DPage.clickOnDay();
		    Thread.sleep(3000);
		    DPage.selectSettlementPeriod();
		    Thread.sleep(3000);
		    DPage.clickOnViewbtn();
		    Thread.sleep(3000);
		
	}
	
}
