package pagess;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import rResources.Basse;
import rResources.ExtendsReportS;

public class Listenerss extends Basse implements ITestListener{
	ExtendsReportS R= new ExtendsReportS();
	ExtentReports extent =R.config();
	public ExtentTest test;
	
	ThreadLocal <ExtentTest> ExtentTest= new ThreadLocal<ExtentTest>();
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		test=extent.createTest(result.getMethod().getMethodName());
		ExtentTest.set(test);
		
		
		 ExtentTest.get().log(Status.INFO,"infore");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//	ITestListener.super.onTestSuccess(result);
	ExtentTest.get().log(Status.PASS, "Test Pass");
	System.out.print("pssd codes");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.print("Code Fail");
		test.fail(result.getThrowable());
		ExtentTest.get().fail(result.getThrowable());		
		String MethodName =result.getMethod().getMethodName();
		WebDriver driver = null;
		try
		{
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	try
	{
		ExtentTest.get().addScreenCaptureFromPath(getScreenShotPaths(MethodName , driver) ,result.getMethod().getMethodName());
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		}
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		extent.flush();
	}
	
	

}
