package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.PageObjects.BalancingPage;

import util.BaseClass;

public class Balancing_Page_Tests extends BaseClass {
	
	BalancingPage BPage;

	@Test
	public void OpenbalancingPageAndClickDisBad() {

		BPage = PageFactory.initElements(driver, BalancingPage.class);
		BPage.clickOnDisbsad();

		
	}
	
	
	
}
