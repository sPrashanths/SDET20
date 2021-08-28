package com.vtiger.comcast.opportunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.comcast.genericUtility.ExcelUtility;
import com.vtiger.comcast.genericUtility.FileUtility;
import com.vtiger.comcast.genericUtility.JavaUtility;
import com.vtiger.comcast.genericUtility.WebDriverUtility;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.LogIn;

public class OpportunitycreateFilter {

	public static void main(String[] args) throws Throwable {
		/* object creation for library*/
		JavaUtility jLib= new JavaUtility();
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		int randomint = jLib.getRanDomNumber();
		/* Common Data */
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String URL = fLib.getPropertyKeyValue("url");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		
		String Lastname = eLib.getDataFromExcel("Sheet1", 1, 2)+randomint;
		String Company = eLib.getDataFromExcel("Sheet1", 1, 3);
		
		WebDriver driver = new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
		driver.get(URL);
		
		/* Step : 1 Login to application */
		LogIn loginpage = new LogIn(driver);
		loginpage.loginToApp(USERNAME, PASSWORD);
		
		Home homepage = new Home(driver);
		homepage.getOpportunitiesBtn().click();


	}

}
