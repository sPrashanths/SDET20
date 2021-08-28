package com.vtiger.comcast.Leadstest;

import org.apache.tools.ant.filters.TokenFilter.Trim;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.Home;

@Listeners(com.vtiger.comcast.genericUtility.ListImpClass.class)
public class NavigateToLeadPageTest_TC01 extends BaseClass  {
	@Test
	public void NavigateToLeadPage() {
		/* navigate to leads module */
		Home homepage = new Home(driver);
		
		/* click on leads module */
		homepage.getLeadsLink().click();
		
		/* click on create leads button */
		homepage.getCreateLeadbtn().click();
		
		/* validation */
		String expectedTitle=" Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM".trim();
		String actualTitle = driver.getTitle().trim();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertTrue(actualTitle.contains(expectedTitle));;
	}

}
