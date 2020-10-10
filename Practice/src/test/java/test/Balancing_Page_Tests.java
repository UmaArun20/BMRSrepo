package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.PageObjects.BalancingPage;

import util.BaseClass;

public class Balancing_Page_Tests extends BaseClass {
		
	BalancingPage BPage;

	@Test(dataProvider = "abc")
	void OpenbalancingPageAndClickDisBad(String a,String b) {
		
		System.out.println(a+b);
		
		BPage = new BalancingPage(driver);
		BPage.clickOnBalancing();
		//BPage.clickOnDisbsad();
	
	}
	
	
	
}
