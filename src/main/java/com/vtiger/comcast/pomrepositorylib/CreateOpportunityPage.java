package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunityPage {
	public void CreateOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement OppBtn;
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement OppNameEdt;
	
	@FindBy(xpath="(//img[@title ='Select'])[1]")
	private WebElement RelatedBtn;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBtn;

	public WebElement getOppBtn() {
		return OppBtn;
	}

	public WebElement getOppNameEdt() {
		return OppNameEdt;
	}

	public WebElement getRelatedBtn() {
		return RelatedBtn;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	public void createOpp(String oppName) {
		
	}

}
