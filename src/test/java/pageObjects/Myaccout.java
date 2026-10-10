package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccout extends Basepage

{

	public Myaccout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement myactxt;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;
	
	public boolean txtconfrtn( )
	{
		try
		{
			return (myactxt.isDisplayed());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public void logoutbtn()
	{
		logout.click();
	}
}
