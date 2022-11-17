package oObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lobjects {
	
	public WebDriver driver;
	
	
	public Lobjects(WebDriver driver)
	{
	this.driver=driver;
		
	}
	
	
	By Logbutton =By.xpath("//span[normalize-space()='Register']");

	By name =By.xpath("//input[@id='user_name']");
	By email =By.xpath("//input[@id='user_email']");
	By password =By.xpath("//input[@id='password']");


	public WebElement loginclick()
	{
		return driver.findElement(Logbutton);
	}
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}

}
