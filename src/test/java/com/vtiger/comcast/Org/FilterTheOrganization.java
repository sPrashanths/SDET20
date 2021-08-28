package com.vtiger.comcast.Org;

import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateFilterPage;
import com.vtiger.comcast.pomrepositorylib.Home;

public class FilterTheOrganization extends BaseClass {
	@Test
	public void FilterTheOrganization() {
		
		
		Home homepage = new Home(driver);
		homepage.Organizationslink().click();
		
		CreateFilterPage Fpage=new CreateFilterPage(driver);
		Fpage.Select_DD(0);
		
		Fpage.getFilterEdt().click();
		
	}

}
