package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Attendance {
WebDriver driver;
By attendance = By.xpath("//a[normalize-space()='']");
By selectmnth = By.xpath("//*[@id=\"react-select\"]/div/div[1]");
public Attendance(WebDriver driver)
{
	this.driver=driver;
}
public void attndnce()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	driver.findElement(attendance).click();
	driver.findElement(selectmnth).click();
}
}
