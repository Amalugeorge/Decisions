package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Users {
WebDriver driver;
By users = By.xpath("//span[normalize-space()='Users']");
By addusr = By.xpath("//button[@class='ml-2 btn btn-primary']");
By firstnme = By.xpath("//*[@id=\"first_name\"]");
By lstnme = By.xpath("//*[@id=\"last_name\"]");
By email = By.xpath("//*[@id=\"email\"]");
By usrrle = By.xpath("//*[@id=\"user_role\"]");
By submit = By.xpath("//button[normalize-space()='Submit']");
By threedots = By.xpath("(//div[@class='d-flex'])[1]/div[1]/span");
By search = By.xpath("//div[@class='tab-pane active']//input[@id='search-input']");
By shw = By.xpath("//div[@class='tab-pane active']//select[@id='sort-select']");

By milestone = By.xpath("//button[@class='w-100 dropdown-item'][1]");
By addmilestn= By.xpath("//div[@class='vertical-timeline vertical-timeline--animate vertical-timeline--two-columns']/div/span");
By title = By.xpath("//div[@class='col-12 col-md-12'][1]/div[1]/input[1]");
By descrpt = By.xpath("//div[@class='col-12 col-md-12'][2]/div/textarea");
By date = By.xpath("//input[@id='range-picker']");
By mnth = By.xpath("//div[@class='flatpickr-current-month']/select");
By monthdte=By.xpath("//div[@class='flatpickr-days']/div/span[12]");
By icn = By.xpath("//div[@class='col-12 col-md-12'][4]/div/div/div/div[1]");
By slcticon = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[5]");
By submitmilstn  = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button");
By milestnthreedts = By.xpath("//div[@class='chart-dropdown dropdown'][1]/button[1]");
By editmilstne = By.xpath("//div[@class='chart-dropdown dropdown show']/div/button[1]");
By cancelmlstn = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[2]");
By deletemlstn = By.xpath("//button[2]");
By edit  = By.xpath("//div[@class='dropdown show']/div/button[1]");
By canceledit = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[2]");
By deleteusr  = By.xpath("//div[@class='dropdown show']/div/button[2]");
By inviteagn = By.xpath("//div[@class='dropdown show']/div/button[3]");
By inactivebtn = By.xpath("//div[@class='custom-switch custom-control custom-control-inline'][1]");
By ysdlt = By.xpath("//div[@class='swal2-actions']/button[1]");
By okdelet = By.xpath("//button[normalize-space()='OK']");
By ysdeletemilstne = By.xpath("//button[normalize-space()='Yes, delete it!']");
By okdeletemilest = By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled']");
By checkbox = By.xpath("//input[@id='check_79']");
By okinviteagain = By.xpath("//button[@class='swal2-confirm btn btn-primary']");
By enableordisableactv = By.xpath("//div[@class='custom-switch custom-control custom-control-inline']");
By inactivebuttn = By.xpath("//li[@class='nav-item']//a[@class='nav-link']");
By inactvedisable = By.xpath("//label[@for='switch_74']");
public Users(WebDriver driver)
{
	this.driver=driver;
}

public void usr(String t,String d) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(users).click();
	driver.findElement(threedots).click();;
	driver.findElement(milestone).click();
	driver.findElement(addmilestn).click();
	driver.findElement(title).sendKeys(t);
	driver.findElement(descrpt).sendKeys(d);
	driver.findElement(date).click();
	WebElement month=driver.findElement(mnth);
	month.click();
	Select mnthelmnt= new Select(month);
	mnthelmnt.selectByVisibleText("December");
	driver.findElement(monthdte).click();
	driver.findElement(icn).click();
	driver.findElement(slcticon).click();
	driver.findElement(submitmilstn).click();
	Thread.sleep(5000);
	System.out.println("milestone is created");
	driver.findElement(milestnthreedts).click();
	driver.findElement(editmilstne).click();
	System.out.println("milestone is edited");
	driver.findElement(cancelmlstn).click();
	System.out.println("milestone edit is cancelled");
	driver.findElement(milestnthreedts).click();
	driver.findElement(deletemlstn).click();
	driver.findElement(ysdeletemilstne).click();
	driver.findElement(okdeletemilest).click();
	System.out.println("milestone is deleted");
	driver.findElement(checkbox).click();
}

	public void edit() throws InterruptedException
	{
	driver.findElement(users).click();
	WebElement thrdts = driver.findElement(threedots);
	thrdts.click();
	driver.findElement(deleteusr).click();
	driver.findElement(ysdlt).click();
	driver.findElement(okdelet).click();
	System.out.println("user deleted");
	thrdts.click();
	driver.findElement(edit).click();
	driver.findElement(canceledit).click();
	System.out.println("cancel is working in the edit field");
	}
	public void inviteagin()
	{
		driver.findElement(users).click();
	driver.findElement(threedots).click();
	//thrdts.click();
	driver.findElement(inviteagn).click();
	driver.findElement(okinviteagain).click();
	System.out.println("invited again");
	//driver.findElement(inactivebtn).click();
	}
	public void search(String s) {
		driver.findElement(users).click();
	driver.findElement(search).sendKeys(s);
	}
	public void addnewusr(String f,String l,String e) {
		driver.findElement(users).click();

	driver.findElement(addusr).click();
	driver.findElement(firstnme).sendKeys(f);
	driver.findElement(lstnme).sendKeys(l);
	driver.findElement(email).sendKeys(e);
	/*WebElement role=driver.findElement(usrrle);
	role.click();
	Select roleelemnt=new Select(role);
	roleelemnt.selectByVisibleText("Staff");*/
	driver.findElement(submit).click();
	System.out.println("New user is added");
	}
	public void shwn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(users).click();
	WebElement shwno = driver.findElement(shw);
	Select shwelmnt = new Select(shwno);
	shwelmnt.selectByVisibleText("25");
	//Thread.sleep(1000);	
}
	public void enabledisable()
	{
		driver.findElement(users).click();
		driver.findElement(enableordisableactv).click();
		System.out.println("user is inactivated successfully");
	}
	public void inactive()
	{
		driver.findElement(users).click();
		driver.findElement(inactivebuttn).click();
		driver.findElement(inactvedisable).click();
		System.out.println("user is activated successfully");
	}
}
