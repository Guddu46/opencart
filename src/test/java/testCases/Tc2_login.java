package testCases;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccout;

public class Tc2_login extends BaseClass
{
	@Test(groups = {"sanity","master"})
	public void verify() throws InterruptedException
	{
		try {
		HomePage hp = new HomePage(driver);
		hp.myacc();
		hp.loinbt();
		Thread.sleep(2000);
		
		Loginpage lp =new Loginpage(driver);
		lp.emailinput(p.getProperty("email"));
		lp.password(p.getProperty("passwrd"));
		lp.logbtn();
		
		Myaccout mc = new Myaccout(driver);
		boolean cnfr=mc.txtconfrtn();
		Assert.assertTrue(cnfr);
		mc.logoutbtn();
	
		}
		
		
		
		catch(Exception e)
		{
			Assert.fail();
		}
		 
	
		
	}
}
