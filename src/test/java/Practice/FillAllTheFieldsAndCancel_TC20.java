package Practice;

import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewLead;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.LeadInfo;

public class FillAllTheFieldsAndCancel_TC20 extends BaseClass {
	@Test
	public void FillAllTheFieldsAndCancel_TC20() throws Throwable {
		
		String Lastname = eLib.getDataFromExcel("Sheet1", 1, 2);
		String Company = eLib.getDataFromExcel("Sheet1", 1, 3);
		
		/* Step : 2 navigate to leads */
		Home homepage = new Home(driver);
		homepage.getLeadsLink().click();
		homepage.getCreateLeadbtn().click();
		
		/* Step : 3 click on create lead*/
		CreateNewLead newLead = new CreateNewLead(driver);
		newLead.CreateLead(Lastname, Company);
		
	//	LeadInfo lf=new LeadInfo(driver);
//		/* Step : 4 validation*/
//		if(lf.getLeadNoFeild().equals(newLead.getLeadNoList()))
//			System.out.println("Fail");
//		else
//			System.out.println("pass");
		
	}

}
