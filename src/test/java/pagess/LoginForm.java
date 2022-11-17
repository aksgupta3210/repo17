package pagess;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import oObjects.Hobjects;
import oObjects.Lobjects;
import rResources.Basse;

public class LoginForm extends Basse {
	
	public WebDriver driver;
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][3];

		data[0][0]= "A";
		data[0][1]= "A@";
		data[0][2]= "A1";
	
		data[1][0]= "B";
		data[1][1]= "B@";
		data[1][2]= "B1";
		
		data[2][0]= "C";
		data[2][1]= "C@";
		data[2][2]= "C1";
		
		
		return data;
		
	}
	
	@Test(dataProvider="getdata")
	public void Basenavigate(String Name , String Email, String Password) throws IOException
	{
		driver=BaseCreate() ;
		Hobjects H = new Hobjects(driver);
		H.NothanksClick().click();
		
		Lobjects L =new Lobjects(driver);
		L.loginclick().click();
		
		L.Name().sendKeys(Name);
		L.Email().sendKeys(Email);
		L.Email().sendKeys(Password);
		
		
	}
	

}
