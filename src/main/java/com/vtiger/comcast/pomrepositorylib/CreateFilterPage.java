package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateFilterPage {
	public CreateFilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create Filter']")
	private WebElement FilterEdt;
	
	@FindBy(xpath="//select[@name='viewname']")
	private WebElement element;

	public WebElement getFilterEdt() {
		return FilterEdt;
	}

	public WebElement getElement() {
		return element;
	}

	public void Select_DD(int x)
	{
		Select s = new Select(element);
		s.selectByIndex(x);
	}

	
}
