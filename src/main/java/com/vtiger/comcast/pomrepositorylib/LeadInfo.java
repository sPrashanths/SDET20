package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInfo {
	public LeadInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement LeadSuccessfulMsg;
	
	@FindBy(xpath="(//td[@class='dvtCellLabel'])[2]")
	private WebElement LeadNum;
	
	@FindBy(xpath="(//td[@class='dvtCellInfo'])[2]")
	private WebElement LeadNoFeild;

	public WebElement getLeadNoFeild() {
		return LeadNoFeild;
	}

	public WebElement getLeadSuccessfulMsg() {
		return LeadSuccessfulMsg;
	}

	public WebElement getLeadNum() {
		return LeadNum;
	}
	
	
}
