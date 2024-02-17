package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardpge {
	WebDriver driver;
	By click=By.xpath("//*[@id=\"react-select-5-option-6\"]");
	By addnt = By.xpath("//div[@class='mb-3 col-6 col-md-6']//button[@type='button']");
	By slctusr = By.xpath("//*[@id=\"users\"]/div/div[1]");
	By slctusrclick=By.xpath("//*[@id=\"users\"]/div[1]/div[1]");
	By slctusrlist = By.xpath("//*[@id=\"users\"]/div[2]");
	By fltrbydte = By.xpath("//*[@id=\"range-picker\"]");
	By filterbymonth = By.xpath("/html/body/div[2]/div[1]/div/div/select");
	By filterbydateyear = By.xpath("/html/body/div[5]/div[1]/div/div/div/input");
	By filterbydatearrow = By.xpath("//span[@class='flatpickr-prev-month']//*[name()='svg']");
	By filterbydtedates = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div");
	By activetasks = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/a/div/div/div/div[1]/p");
	By activetskback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/a");
	By overduetsks = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[3]/a/div/div");
	By overduetskback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/a");
	By activeprojects = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[4]/a/div/div/div/div[1]/p");
	By activeprojback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div[1]/a");
	By activeissue = By.xpath("//body/div[@id='root']/div[@class='wrapper vertical-layout navbar-hidden footer-static vertical-menu-modern menu-expanded']/div[@class='app-content content overflow-hidden']/div[@class='mt-3 row']/div[5]/a[1]/div[1]/div[1]/div[1]");
	By activeissuebck = By.xpath("//a[@class='card-back-btn btn btn-primary']");
	By scrnmode = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul[2]/div/li/a/div/label");
	By selectprjct = By.xpath("//*[@id=\"Project\"]/div/div[1]");
	By slctprjdrplst = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By slctusernme = By.xpath("//div[@id='react-select-2-option-3']");
	By startdate = 	By.xpath("//div[@class='flatpickr-days']/div/span[6]");
	By enddate = By.xpath("//div[@class='dayContainer']/span[30]");
	By addtsk = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/button[1]");
	By selcttask = By.xpath("//*[@id=\"Project\"]/div/div[1]");
	By addis = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[8]/div/div/div/button");
	By selecttskdailyrprt = By.xpath("//*[@id=\"task\"]/div/div[1]");
	By selectedtskdlyrpt = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[2]");
	By statusdlyrpt = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By status = By.xpath("//*[@id=\"status\"]/div/div[1]");
	By submitdlyrpt = By.xpath("//button[normalize-space()='Submit']");
	By arrowdlyrpt = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[6]/div/div/div/div/div/div[4]/div/div[1]/div[2]");
	By selectedtaskaddtsk = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By tsknme = By.xpath("//input[@id='task']");
	By descrptn = By.xpath("//*[@id=\"description\"]");
	By submittsk = By.xpath("//button[normalize-space()='Submit']");
	By selectprissue = By.xpath("//div[@id='Project']//div[@class='select__value-container css-1hwfws3']");
	By selectedprjissue = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By issuenme = By.xpath("//input[@id='issue']");
	By issuedesc = By.xpath("//textarea[@id='issue_description']");
	By issuesubmit = By.xpath("//button[normalize-space()='Submit']");
	By uparrw = By.xpath("//button[@class='btn-icon btn btn-primary']");
	public Dashboardpge(WebDriver driver)
	{
		this.driver=driver;
	}
	public void slctusr(String usr) throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
	WebElement el=driver.findElement(slctusr);
	el.click();
	
		//selectuser.click();
		//selectuser.sendKeys(user);
		Thread.sleep(5000);
		List<WebElement> optlst = driver.findElements(slctusrlist);
		for(WebElement lst:optlst) {
			System.out.println("List of users: "+lst.getText());
			
			}
		driver.findElement(slctusernme).click();
		
		driver.findElement(fltrbydte).click();
		driver.findElement(filterbydatearrow).click();
		driver.findElement(startdate).click();
		driver.findElement(enddate).click();
			
	}

		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(activeprojback))
		//selectuser.sendKeys(Keys.ARROW_DOWN);
		
		//selectuser.sendKeys(Keys.ENTER);
	
	public void dshbrd()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(activetasks).click();
		System.out.println("activetasks is working");
		driver.findElement(activetskback).click();
		System.out.println("activetskback is working");
		driver.findElement(overduetsks).click();
		System.out.println("overduetsks is working");
		driver.findElement(overduetskback).click();
		System.out.println("overduetskback is working");
		driver.findElement(activeprojects).click();
		System.out.println("activeprojects is working");
		driver.findElement(activeprojback).click();
		System.out.println("activeprojback is working");
		driver.findElement(activeissue).click();
		System.out.println("activeissue is working");
		driver.findElement(activeissuebck).click();
		System.out.println("activeissueback is working");
		driver.findElement(scrnmode).click();
		driver.findElement(scrnmode).click();
	
		}
	public void addnote() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(addnt).click();
		Thread.sleep(2000);
		WebElement slctpj = driver.findElement(selectprjct);
		slctpj.click();
		driver.findElement(slctprjdrplst).click();
		/*String optionselect = "Selections";
		driver.findElement(selectprjct).sendKeys("Selections");
		List<WebElement>optionlist = driver.findElements(slctprjdrplst);
		for(WebElement ele:optionlist)
		{
			String currentopt = ele.getText();
			if(currentopt.contains(optionselect))
			{
				ele.click();
				break;
			}
		}*/
		Thread.sleep(2000);
		driver.findElement(selecttskdailyrprt).click();
		Thread.sleep(2000);
		driver.findElement(selectedtskdlyrpt).click();
		driver.findElement(status).click();
		driver.findElement(statusdlyrpt).click();
		driver.findElement(submitdlyrpt).click();
		//Thread.sleep(2000);
		//driver.findElement(arrowdlyrpt).click();
	}
	public void addtask(String tsk,String desc) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(addtsk).click();
		Thread.sleep(2000);
		driver.findElement(selcttask).click();
		driver.findElement(selectedtaskaddtsk).click();
		driver.findElement(tsknme).sendKeys(tsk);
		driver.findElement(descrptn).sendKeys(desc);
		driver.findElement(submittsk).click();
		System.out.println("task added");
		
	}
	public void addissue(String isenme,String isdesc) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(addis).click();
		Thread.sleep(3000);
		driver.findElement(selectprissue).click();
		Thread.sleep(3000);
		driver.findElement(selectedprjissue).click();
		driver.findElement(issuenme).sendKeys(isenme);
		driver.findElement(issuedesc).sendKeys(isdesc);
		driver.findElement(issuesubmit).click();
		System.out.println("issue added successfully");
		driver.findElement(uparrw).click();
	}
		
} 
