package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjects.Basepage;

public class BaseClass 
{
	public WebDriver driver;
	public Properties p;

		
	
	@BeforeClass
	public void setup() throws  IOException
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	p= new Properties();
	
	FileReader file = new FileReader("./src//test//resources//config.properties");
	p.load(file);
	driver.get(p.getProperty("appurl1"));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
		public String randonString()
	{
		String gene=RandomStringUtils.randomAlphabetic(5);
		return gene; 
	}

}
