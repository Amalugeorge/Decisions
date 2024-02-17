package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Projects {
WebDriver driver;
By projects = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/a");
By search = By.xpath("//input[@id='search']");
By threedts = By.xpath("//button[@aria-expanded='true']//*[name()='svg']");
By pageuparrw = By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/button/svg/polyline");
By addnew = By.xpath("//button[@class='add btn btn-primary']");
By projname = By.xpath("//input[@id='project_name']");
By missionpr = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr'][1]");
By visionpr = By.xpath("//*[@id=\"rdw-wrapper-6506\"]/div[2]");
By client  = By.xpath("//*[@id=\"rdw-wrapper-6374\"]/div[2]/div/div/div/div/div/div");
 public Projects(WebDriver driver) 
{
	this.driver=driver;
}
public void tsks(String s) 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(projects).click();
	driver.findElement(search).sendKeys(s);
	driver.findElement(threedts).click();
	//driver.findElement(pageuparrw).click();
}
public void addnewpr(String prj,String msn,String clent,String vsn) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(projects).click();
	driver.findElement(addnew).click();
	driver.findElement(projname).sendKeys(prj);
	Thread.sleep(2000);
	driver.findElement(missionpr).sendKeys(msn);
	Thread.sleep(2000);
	WebElement clnt=driver.findElement(client);
	Actions actions = new Actions(driver);
    actions.moveToElement(clnt).perform();
    clnt.sendKeys(clent);
  Thread.sleep(2000);
   // visn.sendKeys(vsn);
    driver.findElement(visionpr).click();
	//driver.findElement(client).click();
}
}
