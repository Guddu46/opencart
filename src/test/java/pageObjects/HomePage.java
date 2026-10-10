package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
		WebElement myacc;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
		WebElement regis;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
		WebElement login;
	
	public void myacc() throws InterruptedException
	{
		myacc.click();
		Thread.sleep(1000);
	}
	
	public void register() throws InterruptedException
	{
		
		regis.click();
	}
	public void loinbt() throws InterruptedException
	{
		
		login.click();
	}
}
