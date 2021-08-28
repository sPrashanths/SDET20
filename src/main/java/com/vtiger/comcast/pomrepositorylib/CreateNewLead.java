package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLead {

	public CreateNewLead(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="lastname")
	private WebElement LastnmaeEdt;
	
	@FindBy(name="company")
	private WebElement CompanyEdt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//a[text()='Lead No']")
	private WebElement LeadNoList;
	

	public WebElement getLeadNoList() {
		return LeadNoList;
	}

	public WebElement getLastnmaeEdt() {
		return LastnmaeEdt;
	}

	public WebElement getCompanyEdt() {
		return CompanyEdt;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public void CreateLead(String LastName, String Company)
	{
		LastnmaeEdt.sendKeys(LastName);
		CompanyEdt.sendKeys(Company);
		SaveBtn.click();
	}
	
	
}
