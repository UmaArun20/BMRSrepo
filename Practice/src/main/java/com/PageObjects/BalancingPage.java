package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Wrapper;

public class BalancingPage extends Wrapper {

	//public WebDriver driver;

	public BalancingPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Balancing']")
	public WebElement balancing;

	public void clickOnBalancing() {
		clickonElement(balancing);
	}
	
	@FindBy(xpath="//a[text()=' DISBSAD ']")
	public WebElement dISBSAD;

	public void clickOnDisbsad() {
		clickonElement(dISBSAD);
	}
}
