package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountregiPage extends Basepage
{
	
	
	
	public AccountregiPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
			WebElement firstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement phn;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwrd;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement cnpasswrd;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement PolicyBttn;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement conti;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confrmtn;
	
	
	
	
	public void fistName(String fn)
	{
		firstname.sendKeys(fn);
	}
	public void lastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	public void email(String mail)
	{
		Email.sendKeys(mail);
		
	}
	public void number(String phnnumber)
	{
		phn.sendKeys(phnnumber);
	}
	public void pwd(String pass)
	{
		passwrd.sendKeys(pass);
	}
	public void cnfpas(String cnfrmpass)
	{
		cnpasswrd.sendKeys(cnfrmpass);
	}
	public void policy()
	{
		PolicyBttn.click();
	}
	public void continu()
	{
		conti.click();
	}
	public String confirm()
	{
		try{
			return (confrmtn.getText());
		}
		catch (Exception e)
		{
			return e.getMessage();
		}
	}
}
