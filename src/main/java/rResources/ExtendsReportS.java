package rResources;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportS {
	
	public WebDriver driver;
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	
	
	public ExtentReports config()
	{
		String path = System.getProperty("user.dir")+"\\reporAG\\indexx.html" ;
		
		reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Auto");
		reporter.config().setDocumentTitle("Test Result");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Aks");
		
		return extent;
		
		
	}

}
