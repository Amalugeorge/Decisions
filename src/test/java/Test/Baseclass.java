package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void browser()
		{
			driver=new ChromeDriver();
			driver.get("http://decisions-staging.s3-website-us-east-1.amazonaws.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("vishnurajan@abacies.com");
			driver.findElement(By.id("login-password")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/button")).click();
		}
}
