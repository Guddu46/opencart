package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccout;
import utilities.DataProviders;

public class Tc3_loginDDT extends BaseClass
{
	
	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class,groups = {"datadriven","master"})
	public void verifylogin(String email,String pwd,String exp) throws Exception
	{
		try {
			HomePage hp = new HomePage(driver);
			hp.myacc();
			hp.loinbt();
			
			Loginpage lp =new Loginpage(driver);
			lp.emailinput(email);
			lp.password(pwd);
			lp.logbtn();
			
			Myaccout mc = new Myaccout(driver);
			boolean textexist=mc.txtconfrtn();
			
			
			if(exp.equalsIgnoreCase("valid"))
			{
				if(textexist==true)
				{
					mc.logoutbtn();
					Assert.assertTrue(true);
				}
			
			else
			{
				Assert.assertTrue(false);
			}
	}	
	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(textexist==true)
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
}
