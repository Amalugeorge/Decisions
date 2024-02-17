package Test;

import org.testng.annotations.Test;

import Page.Projects;

public class Projectstest extends Baseclass{
@Test
public void actvetst() throws InterruptedException
{
	Projects ob = new Projects(driver);
	//ob.tsks("test");
	ob.addnewpr("Test staging admin","Test mission","Test client","Test vision");
}
}
