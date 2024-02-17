package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Decisionforgotpswrd;



public class Decisionfrgtpswdtest extends Baseclass{
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.get("http://decisions-staging.s3-website-us-east-1.amazonaws.com/login");
		driver.manage().window().maximize();
	}
		@Test
		public void tstfrgtpswd()
		{
			Decisionforgotpswrd ob = new Decisionforgotpswrd(driver);
			ob.forgotpswd("abc@gmail.com");
		}
		@AfterTest
		public void close()
		{
			driver.close();
		}


}
