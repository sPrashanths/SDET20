package com.vtiger.comcast.Leadstest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewLead;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.Lead;
import com.vtiger.comcast.pomrepositorylib.LeadInfo;

public class CreateLead extends BaseClass{
	@Test
	public void CreateLead() throws Throwable {
		
		
		/* test script data*/
		String LeadLastName=eLib.getDataFromExcel("Sheet1", 1, 2);
		String CompanyName = eLib.getDataFromExcel("Sheet1", 1, 3);
		
		/* Step 2 : Navigation to lead */
		Home homepage = new Home(driver);
		homepage.getLeadsLink().click();
		
		/* Step 3 : Navigate to "create new lead" page by clicking on "+" image */
		Lead orgpage=new Lead(driver);
		orgpage.getCreateLeadImg().click();
		
		/* Step 4 : Create new lead */
		CreateNewLead lead=new CreateNewLead(driver);
		lead.CreateLead(LeadLastName, CompanyName);;
		
		/* Step 4 : verify the successful msg with lead creation */
		LeadInfo succmsg=new LeadInfo(driver);
		String actualSuccFulMsg=succmsg.getLeadSuccessfulMsg().getText();
		
		Assert.assertTrue(actualSuccFulMsg.contains(LeadLastName));
		
//		if (actualSuccFulMsg.contains(LeadLastName)) {
//			System.out.println(LeadLastName+" : created Successfully :: PASS");
//		}
//		else
//			System.out.println(LeadLastName+" : not created Successfully :: FAIL");
		
	}

}
