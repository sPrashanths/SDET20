package com.vtiger.comcast.Leadstest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewLead;
import com.vtiger.comcast.pomrepositorylib.Home;

public class BlankFieldsAndCancel_21 extends BaseClass {
	@Test
	public  void BlankFieldsAndCancel_21Test() throws Throwable {
		
		String Lastname ="";
		String Company = "";
		
		Home homepage = new Home(driver);
		homepage.getLeadsLink().click();
		homepage.getCreateLeadbtn().click();
		
		CreateNewLead cnl = new CreateNewLead(driver);
		cnl.CreateLead(Lastname, Company);
		
		String expectedpopupMsg = "Last Name cannot be empty";
		String ActualPopupMsg = driver.switchTo().alert().getText();
		
		Assert.assertEquals(ActualPopupMsg, expectedpopupMsg);
			
	}
}
