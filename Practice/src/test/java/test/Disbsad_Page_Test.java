package test;

import org.testng.annotations.Test;

import com.PageObjects.BalancingPage;
import com.PageObjects.DisbsadPage;

import util.BaseClass;

	public class Disbsad_Page_Test extends BaseClass{
	  	
		@Test
		public void OpenDisBsadAndViewTable() throws InterruptedException {
	
			
			//DisbsadPage DPage = PageFactory.initElements(driver, DisbsadPage.class);
			//BalancingPage BPage = new BalancingPage(driver);
			DisbsadPage DPage = new DisbsadPage(driver);

			DPage.clickOnBalancing();
			Thread.sleep(3000);
			DPage.clickOnDisbsad();
			//DPage.verifyHeader();
			Thread.sleep(3000);
			DPage.clickOnCalender();
		    Thread.sleep(3000);
		    DPage.selectMonth();
		    Thread.sleep(3000);
		    DPage.selectYearOption();
		    Thread.sleep(3000);
		    DPage.clickOnDay();
		    Thread.sleep(3000);
		    DPage.clickSettlementPeriod();
		    Thread.sleep(3000);
		    DPage.selectSettlementPeriodAll();
		    Thread.sleep(3000);
		    DPage.clickOnViewbtn();
		    Thread.sleep(3000);
		
	}
	
}
