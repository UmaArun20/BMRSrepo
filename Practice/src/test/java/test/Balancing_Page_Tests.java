package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.PageObjects.BalancingPage;

import util.BaseClass;

public class Balancing_Page_Tests extends BaseClass {
		
	BalancingPage BPage;

	@Test
	void OpenbalancingPageAndClickDisBad() {

		
		BPage = new BalancingPage(driver);
		BPage.clickOnBalancing();
		BPage.clickOnDisbsad();
	
	}
	
	
	
}
