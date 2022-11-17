package rResources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
//import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import oObjects.Hobjects;

public class Basse {
	
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver BaseCreate() throws IOException
	{
		pro = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Win_!0\\eclipse-workspace\\BirsaMundda\\src\\main\\java\\rResources\\confii.Properties");
		pro.load(fs);
		
		String BrowserName= pro.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win_!0\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(pro.getProperty("url"));
		
		return driver;
	}
	
	public String getScreenShotPaths (String testCaseName , WebDriver driver) throws IOException
	{
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Source= ts.getScreenshotAs(OutputType.FILE);
		
		String Destfile =System.getProperty("user.dir")+"\\repoo\\"+testCaseName+".png";
		
		FileUtils.copyFile(Source, new File(Destfile));
	//akash gupta@
		return Destfile;
	}
	
	
	public void DriverIntiall() throws IOException
	{
		driver=BaseCreate() ;
		Hobjects H = new Hobjects(driver);
		H.NothanksClick().click();
	}
	
}
