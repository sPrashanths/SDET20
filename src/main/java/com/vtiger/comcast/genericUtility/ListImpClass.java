package com.vtiger.comcast.genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.batik.dom.events.DocumentEventSupport.EventFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener
{
	
	public void onTestFailure(ITestResult result) 
	{
		String testName = result.getMethod().getMethodName();
		System.out.println(testName+"======Execute and i am listening");
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+".png"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
