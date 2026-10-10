package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountregiPage;

import pageObjects.HomePage;

public class Tc_accReg extends BaseClass
{
	
	@Test(groups = {"regression","master"})
	public void  execure() throws InterruptedException
	{
		HomePage hp =new HomePage(driver);
		hp.myacc();
		hp.register();
		
		AccountregiPage arp = new AccountregiPage(driver);
		
		Thread.sleep(2000);
		arp.fistName("gfdgfdg");
		arp.lastName("dasdas");
		arp.email("fsdfcxcsdf@gmail.com");
		arp.number("34324xx23" );
		arp.pwd("fsfddf");
		arp.cnfpas("fsfddf");
		arp.policy();
		arp.continu();
		Assert.assertEquals(arp.confirm(), "Your Account Has Been Created!"); 
	}
	
	
}
//fsdfsdf@gmail.com
//