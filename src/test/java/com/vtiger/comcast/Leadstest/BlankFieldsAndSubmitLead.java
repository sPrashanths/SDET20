package com.vtiger.comcast.Leadstest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewLead;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.Lead;

public class BlankFieldsAndSubmitLead extends BaseClass{
	@Test
public void BlankFieldsAndSubmitLead() {
		
		/* Step 2 : Navigation to lead */
		Home homepage = new Home(driver);
		homepage.getLeadsLink().click();
		
		/* Step 3 : Navigate to "create new lead" page by clicking on "+" image */
		Lead orgpage=new Lead(driver);
		orgpage.getCreateLeadImg().click();
		
		/* Step 4 : click on save button */
		CreateNewLead lead=new CreateNewLead(driver);
		lead.CreateLead("", "");
		
		/* Step 5 : To verify the popup text */
		String actualpopupText = driver.switchTo().alert().getText();
		String expextedPopupText="Last Name cannot be empty";
		
		Assert.assertEquals(actualpopupText, expextedPopupText);
//		if (actualpopupText.equals(expextedPopupText))
//			System.out.println("PopUp text is correct :: PASS");
//		else
//			System.out.println("PopUp text is incorrect :: FAIL");
		
		driver.switchTo().alert().dismiss();
		
	}
}
