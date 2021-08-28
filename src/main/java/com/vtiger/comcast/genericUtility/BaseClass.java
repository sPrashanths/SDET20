package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.LogIn;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	/*Object Creation for Lib*/
	public JavaUtility jLib= new JavaUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	@BeforeSuite 
	public void configBS() {
		System.out.println("========================connect to DB========================");
		
		}
	
		@BeforeClass
		public void configBC() {
		System.out.println("=============Launch the Browser=======");
		driver = new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
		sDriver=driver;
		}
	
//	@Parameters("BROWSER")
//	@BeforeClass
//	public void configBC(String BROWSER) {
//		System.out.println("=============Launch the Browser=======");
//		if(BROWSER.equals("chrome")) {
//		driver = new ChromeDriver();
//		}
//		else if(BROWSER.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else
//			System.out.println("Browser Not Found");
//		
//		wLib.waitUntilPageLoad(driver);
//		driver.manage().window().maximize();
//	}
	
	@BeforeMethod
	public void configBM() throws Throwable {
		/*common Data*/
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String URL = fLib.getPropertyKeyValue("url");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		/* Navigate to app*/
		driver.get(URL);
		/* step 1 : login */
        LogIn loginPage = new LogIn(driver);
        loginPage.loginToApp(USERNAME, PASSWORD);
	}

	@AfterMethod
	public void configAM() {
	/*step 6 : logout*/
		Home homePage = new Home(driver);
		homePage.logout();
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("========================close DB========================");
	}
}

	
	
