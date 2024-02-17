package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Decisionforgotpswrd {
	WebDriver driver;
	By frgtpsw = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[1]/a/small");
	By frgtemail = By.name("email");
	By sndrstlink = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/button");
	By bcktolgn = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/p[3]/a/span");
	public Decisionforgotpswrd(WebDriver driver) {
		this.driver=driver;
	}
	public void forgotpswd(String fremail)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(frgtpsw).click();
		driver.findElement(frgtemail).sendKeys(fremail);
		driver.findElement(sndrstlink).click();
		driver.findElement(bcktolgn).click();
		
	}



}
