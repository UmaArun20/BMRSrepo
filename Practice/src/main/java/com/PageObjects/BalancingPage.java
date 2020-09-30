package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BalancingPage {

	WebDriver driver;

	public BalancingPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(xpath="//a[@class='active_link'][contains(text(),'DISBSAD')]")
	public WebElement dISBSAD;

	public void clickOnDisbsad() {
		dISBSAD.click();
	}

}
