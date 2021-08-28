package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationFilterPage {
	public OrganizationFilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="name=viewname")
	private WebElement Filter_dd;

	public WebElement getFilter_dd() {
		return Filter_dd;
	}
	
	public void selection(String Opt)
	{
		Select s=new Select(Filter_dd);
		s.selectByVisibleText(Opt);
	}
}
