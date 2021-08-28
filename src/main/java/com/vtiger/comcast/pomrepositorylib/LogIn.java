package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn { //Rule 1: create a separate java class for every page in application
	public LogIn (WebDriver driver)
	{					// Rule 3 : execute all the elements and initialize the element PageFactory.intiElements(initialization)
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")   // Rule 2: Identify all the elements using @Findby, @FindAll, and @FindBys (declaration)
	private WebElement userNameedt;
	
	@FindBy(name="user_password")
	private WebElement passwordNameedt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	//Rule 4: declare all the elements as private and provide getters method, business method for (utilization)
	public WebElement getUserNameedt() {
		return userNameedt;
	}

	public WebElement getPasswordNameedt() {
		return passwordNameedt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApp(String username, String password)
	{
		/* step : 1 to login*/
		userNameedt.sendKeys(username);
		passwordNameedt.sendKeys(password);
		loginBtn.click();
	}

}
