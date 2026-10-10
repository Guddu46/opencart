package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage
{
	

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement pass;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbt;
	public void emailinput(String em)
	{
		email.sendKeys(em);
	}
	public void password(String pa)
	{
		pass.sendKeys(pa);
	}
	public void logbtn()
	{
		loginbt.click();
	}
}
