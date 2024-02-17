package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Decisionloginpage;

public class Decisiontest {
	WebDriver driver;
@BeforeTest
	
	public void browser()
	{
		driver=new ChromeDriver();
		driver.get("http://decisions-staging.s3-website-us-east-1.amazonaws.com/login");
		driver.manage().window().maximize();
	}
	@Test
	public void decisiontst()
	{
		Decisionloginpage ob = new Decisionloginpage(driver);
		ob.credentials("vishnurajan@abacies.com", "12345");
		ob.login();
		//ob.dashboard("2023");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
