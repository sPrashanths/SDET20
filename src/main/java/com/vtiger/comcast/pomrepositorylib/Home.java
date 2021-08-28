package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Home {
		WebDriver driver;
		public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Organizations")
		private WebElement Organizationslink;
		
		@FindBy(linkText="Leads")
		private WebElement LeadsLink;
		
		@FindBy(xpath="//img[@title='Create Lead...']")
		private WebElement createLeadbtn;
		
		@FindBy(linkText="Opportunities")
		private WebElement OpportunitiesBtn;
		
		public WebElement getOpportunitiesBtn() {
			return OpportunitiesBtn;
		}
		public WebElement getCreateLeadbtn() {
			return createLeadbtn;
		}

		@FindBy(linkText="Products")
		private WebElement ProdLink;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement AdministraterImg;
		
		@FindBy(linkText="Sign Out")
		private WebElement SignOutLink;
		
		public WebElement Organizationslink() {
			return Organizationslink;
		}
		public WebElement getLeadsLink() {
			return LeadsLink;
		}

		public WebElement getProdLink() {
			return ProdLink;
		}

		public WebElement getAdministraterImg() {
			return AdministraterImg;
		}

		public WebElement getSignOutLink() {
			return SignOutLink;
		}
		
		public void logout()
		{
			Actions act=new Actions(driver);
			act.moveToElement(AdministraterImg).perform();
			SignOutLink.click();
		}

}
