package com.PageObjects;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class B1780Page extends BalancingPage {
	
	
	public B1780Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

			
	 @FindBy(xpath="//div[@class='section-details']//p[contains(text(),'Aggregated Imbalance Volumes')]")
	 private WebElement B1780HeaderText;
	 
	 public void verifyHeader() {
		 String getheaderText= B1780HeaderText.getText();
		// assertEquals("Disaggregated Balancing Services Adjustment Data", (getheaderText)); 
		 assertTrue("Aggregated Imbalance Volumes".equalsIgnoreCase(getheaderText));
	 }

	 
	 @FindBy(xpath="//input[@id='edit-clear']")
	 private WebElement clickOnView;
	 
	 public void clickOnViewbtn(){
		 clickOnView.click();		 
	 }
	 
}
