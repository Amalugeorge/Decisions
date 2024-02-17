package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Decisionloginpage {
	WebDriver driver;

	By dnemail=By.xpath("//input[@id='login-email']");
	By dnpswrd=By.id("login-password");
	By dnvisibilityeyeicon=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/span");
	By dnrememberme=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[3]/div/label");
	By dnlogin=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/button");
	By dnforgotpswrd=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[1]/a");

	By addnt = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[5]/div/div/div/div/div/div[2]/button");
	By slctusr = By.xpath("//*[@id=\"users\"]/div/div[1]/div[1]");
	By fltrbydte = By.xpath("//*[@id=\"range-picker\"]");
	By filterbymonth = By.xpath("/html/body/div[2]/div[1]/div/div/select");
	By filterbydateyear = By.xpath("/html/body/div[5]/div[1]/div/div/div/input");
	By filterbydatearrow = By.xpath("/html/body/div[5]/div[1]/span[2]/svg");
	By filterbydtedates = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div");

	public Decisionloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void credentials(String email,String pswrd)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(dnemail).sendKeys(email);
		driver.findElement(dnpswrd).sendKeys(pswrd);
		driver.findElement(dnvisibilityeyeicon).click();
		driver.findElement(dnrememberme).click();
		
	}
	public void login()
	{
		driver.findElement(dnlogin).click();
	}
	/*public void dashboard(String year) {
		
		//driver.findElement(slctusr).click();
		//driver.findElement(slctusr).sendKeys("nash");
		driver.findElement(fltrbydte).click();
		//driver.findElement(filterbydateyear).sendKeys(year);
		
		//while(true) {
			
		WebElement month=driver.findElement(filterbymonth);
		month.click();
		Select monthelement=new Select(month);
		monthelement.selectByVisibleText("August");
		String mon=month.getText();
		
			System.out.println(mon);
			//break;
		
		/*else
		{
			driver.findElement(filterbydatearrow).click();	

		}*/
		
		
		
		/*List<WebElement> dates=driver.findElements(filterbydtedates);
		for(WebElement day:dates)
		{
		String dayname=	day.getAttribute("aria-label");
		if(dayname.equals("22")) {
			day.click();
			//driver.findElement(expediadepartingdone).click();
			System.out.println("date selected");
		}
		
		}
		
		driver.findElement(addnt).click();
		driver.switchTo().defaultContent();*/
	
		}

