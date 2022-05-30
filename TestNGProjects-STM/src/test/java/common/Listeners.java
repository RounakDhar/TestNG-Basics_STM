package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testutils;

public class Listeners extends testutils implements ITestListener{
	
	public void onTestStart(ITestResult result) 
	{
		System.setProperty("org.uncommons.reportng.title", "RCV Academy Test Report");
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Test Case is Starting");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Status of Execution is -"+result.getStatus());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed - Screenshot Captured");
		
		
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\ASUS\\eclipse-workspace\\TestNGProjects-SoftwareTestingMentor\\screenshot\">Test Results</a>");
	}

}
