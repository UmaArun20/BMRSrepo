package com.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DisbsadPage extends BalancingPage {
	
	
	public DisbsadPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

	
	 @FindBy(xpath="//p[text(),'Disaggregated Balancing Services Adjustment Data']")
	 private WebElement HeaderText;
	 
	 /*public void verifyHeader() {
		 String getheaderText= HeaderText.getText();
		//assertEquals("Disaggregated Balancing Services Adjustment Data", (getheaderText)); 
		assertTrue("Disaggregated Balancing Services Adjustment Data".equalsIgnoreCase(getheaderText));
	 }*/
	 
	 @FindBy(xpath="//img[@class='datepicker-trigger cal-img-disbsad']")
	 private WebElement SelectDatePicker;
	 
	 public void clickOnCalender(){
		 clickonElement(SelectDatePicker);		 
	 }
	 
	 @FindBy(xpath="//select[@class='ui-datepicker-month']")
	 private WebElement SelectMonth;
	 
	 public void selectMonth(){
		 
		 	Select selectMonthobj= new Select(SelectMonth);
		 	selectMonthobj.selectByIndex(8);
	 }
	 
	 @FindBy(xpath="//select[@class='ui-datepicker-year']")
	 private WebElement selectYear;
	 
	 public void selectYearOption(){
		 
		 	Select selectYearobj= new Select(selectYear);
		 	selectYearobj.selectByValue("2020");
	 
	 }
	 
	 @FindBy(linkText="10")
	 private WebElement selectDay;
	 
	 public void clickOnDay(){
		 clickonElement(selectDay);
	 }
	 
	 @FindBy(xpath="//body/div[4]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/img[1]")
      private WebElement clickSettlementPeriod;
	 
	 public void clickSettlementPeriod(){
	 clickonElement(clickSettlementPeriod);}
	 
	 @FindBy(xpath="//p[text()='ALL']")
     private WebElement selectSettlementPeriodAll;
	 
	 public void selectSettlementPeriodAll(){
		 clickonElement(selectSettlementPeriodAll);
	
	 }
	 
	 @FindBy(xpath="//input[@id='edit-view']")
	 private WebElement clickOnView;
	 
	 public void clickOnViewbtn(){
		 clickonElement(clickOnView);		 
	 }
	 
}
