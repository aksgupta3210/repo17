package pagess;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import oObjects.Hobjects;
import rResources.Basse;

public class Homee extends Basse {
	WebDriver driver;

	
	@Test
	public void DriverIntial() throws IOException
	{
		driver=BaseCreate() ;
		Hobjects H = new Hobjects(driver);
		H.NothanksClick().click();
	}

}
