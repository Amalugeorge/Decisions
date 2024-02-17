package Test;

import org.testng.annotations.Test;

import Page.Techniques;

public class Techniquestst extends Baseclass{
@Test
public void tsttechn() throws InterruptedException
{
	Techniques t = new Techniques(driver);
	//t.tchnq("Description of technique test","Strength tst","Weakness tst","Opportunities test","Threats test");
	//t.back();
	t.viewtech();
}
}
