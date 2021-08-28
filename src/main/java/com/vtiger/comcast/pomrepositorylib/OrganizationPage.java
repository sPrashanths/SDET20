package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateOrgImg;
	
	public WebElement getCreateLeadImg() {
		return CreateOrgImg;
	}
}
