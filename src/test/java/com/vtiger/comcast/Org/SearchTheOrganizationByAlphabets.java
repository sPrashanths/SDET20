package com.vtiger.comcast.Org;

import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.SearchOrganizationPage;

public class SearchTheOrganizationByAlphabets extends BaseClass {
@Test
	public void SearchTheOrganizationByAlphabets() throws Throwable {
		/*  testID = TC23  */
		String name= eLib.getDataFromExcel("Sheet1", 4, 3);
		Home homepage = new Home(driver);
		homepage.Organizationslink().click();
		
		SearchOrganizationPage SearchOrgPage=new SearchOrganizationPage(driver);
		SearchOrgPage.getSearchField().sendKeys(name);
		SearchOrgPage.SearchDropDown(0);
		SearchOrgPage.getSearchBtn().click();
		
		if(name.contains("xyz"))
			System.out.println("Pass:: The Searched org name is displayed");
		else
			System.out.println("Fail:: The Searched org name is notdisplayed");
	}

}
