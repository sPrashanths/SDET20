package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchOrganizationPage {
	public SearchOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement SearchField;
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement Search_DD;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement SearchBtn;

	public WebElement getSearchField() {
		return SearchField;
	}

	public WebElement getSearch_DD() {
		return Search_DD;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	public void SearchDropDown(int d)
	{
		Select s=new Select(Search_DD);
		s.selectByIndex(d);
	}
}
