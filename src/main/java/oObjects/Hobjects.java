package oObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hobjects {

	public WebDriver driver;

	public Hobjects(WebDriver driver)
	{
		
		this.driver=driver;
	}
	By Nothanks = By.xpath("//button[normalize-space()='NO THANKS']");
	
	public WebElement NothanksClick()
	{
		return driver.findElement(Nothanks);
		
		
	}
	
}
