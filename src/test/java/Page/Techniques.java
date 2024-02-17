package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Techniques {
WebDriver driver;
By techniq = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[4]/a");
By crtcatgry = By.xpath("//*[@id=\"category\"]/div");
By selectctgry = By.xpath("//*[@id=\"category\"]/div/div[1]");
By selectedctgry = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
By techniques = By.xpath("//*[@id=\"technique\"]/div");
By selectedtechniques = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div");
By createcatgry = By.xpath("//button[@class='waves-effect btn btn-primary']");
By descoftech = By.xpath("//textarea[@id='description']");
By strength = By.xpath("//textarea[@class='swot-strength-text form-control']");
By weaknesses = By.xpath("//textarea[@class='swot-weakness-text form-control']");
By opportunities = By.xpath("//textarea[@class='swot-opportunities-text form-control']");
By threats = By.xpath("//textarea[@class='swot-threats-text form-control']");
By submit = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[4]/button");
By back = By.xpath("//a[normalize-space()='Back']");
By viewtechiq = By.xpath("//li[@class='nav-item']//a[@class='nav-link']");
public Techniques(WebDriver driver)
{
	this.driver=driver;
}
public void tchnq(String descr,String strngth,String weakness,String opprtnities,String thrts) throws InterruptedException
{
	driver.findElement(techniq).click();
	driver.findElement(crtcatgry).click();
	Thread.sleep(2000);
	driver.findElement(selectctgry).click();
	driver.findElement(selectctgry).click();
	driver.findElement(selectedctgry).click();
	Thread.sleep(2000);
	driver.findElement(techniques).click();
	Thread.sleep(2000);
	//driver.findElement(techniques).click();
	Thread.sleep(3000);
	driver.findElement(selectedtechniques).click();
	driver.findElement(createcatgry).click();
	driver.findElement(descoftech).sendKeys(descr);
	driver.findElement(strength).sendKeys(strngth);
	driver.findElement(weaknesses).sendKeys(weakness);
	driver.findElement(opportunities).sendKeys(opprtnities);
	driver.findElement(threats).sendKeys(thrts);
	driver.findElement(submit).click();
	System.out.println("Technique is created");
	driver.findElement(back).click();
	
}
public void back() throws InterruptedException
{
	driver.findElement(techniq).click();
	driver.findElement(crtcatgry).click();
	Thread.sleep(2000);
	driver.findElement(selectctgry).click();
	driver.findElement(selectctgry).click();
	driver.findElement(selectedctgry).click();
	Thread.sleep(2000);
	driver.findElement(techniques).click();
	Thread.sleep(2000);
	//driver.findElement(techniques).click();
	Thread.sleep(3000);
	driver.findElement(selectedtechniques).click();
	driver.findElement(createcatgry).click();
	driver.findElement(back).click();	
}
public void viewtech()
{
	driver.findElement(techniq).click();
	driver.findElement(viewtechiq).click();
}
}
