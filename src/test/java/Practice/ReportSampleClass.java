package Practice;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportSampleClass {
	public WebDriver driver;
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest test;
	
	@BeforeSuite
	public void ConfigBS() {
		String LocatDateTime=LocalDateTime.now().toString().replace(":", "-");
		reporter = new ExtentHtmlReporter("../SDET21/Extentreports/SEDT21.html");
		System.out.println("====Before Suite====");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	@BeforeClass
	public void ConfigBC() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("====Before Method====");
	}
	@BeforeMethod
	public void CinfigBM() {
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
	@Test
	public void ReportSampleClasstest() {
		test = reports.createTest("ReportSampleClass");
		System.out.println(driver.getTitle());
		}
	
	@Test
	public void HomeTest() {
		test = reports.createTest("ReportSampleClass");
		driver.findElement(By.linkText("Organizations")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.linkText("Organizations")).getText());
		}
	
	@AfterMethod
	public void CinfigAM() 
		{
		Actions act=new Actions(driver);
		WebElement Lbtn = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		act.moveToElement(Lbtn).perform();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		logout.click();
		System.out.println("====After Method====");
		}
	
	@AfterClass
	public void ConfigAC() {
		driver.quit();
	}
	
	@AfterSuite
	public void ConfigAS() {
	
		System.out.println("====After Suite====");
		reports.flush();
	}
	
}
	
