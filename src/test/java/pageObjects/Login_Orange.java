package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Login_Orange extends Basepage
{
	WebDriver driver;
	
	
	public Login_Orange(WebDriver driver)
	
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	WebElement admin;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Name;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement userrole;
	
	@FindBy(xpath = "//div[@role='listbox']//div[1]")
	WebElement roleselect;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement empname;
	
	@FindBy(xpath = "//span[normalize-space()='manda akhil user']")
	WebElement empselect;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement status;
	
	@FindBy(xpath = "//span[normalize-space()='Enabled']]")
	WebElement enbled;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;
	
	
	
	public void usrnm(String un)
	{
		Username.sendKeys(un);
	}
	public void pwd(String pw)
	{
		Password.sendKeys(pw);
	}
	public void  logn()
	{
		submit.click();;
	}
	public void admn()
	{
		admin.click();
	}
	public void usrname(String empname)
	{
	Name.sendKeys(empname);
	}
	public void rlselect()
	{
		roleselect.click();;
	}
	public void userrl()
	{
		userrole.click();;
	}
	public void emplname(String nme)
	{
		empname.sendKeys(nme);
	}
	public void selectemp()
	{
		empselect.click();;
	}
	public void Status()
	{
		status.click();
	}
	public void enable() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(enbled).perform();
		Thread.sleep(1000);
		enbled.click()
		;
	}
	public void search()
	{
		search.click();
	}
}
