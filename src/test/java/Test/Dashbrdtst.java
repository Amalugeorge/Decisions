package Test;

import org.testng.annotations.Test;

import Page.Dashboardpge;



public class Dashbrdtst extends Baseclass{
	@Test
	public void dshbrdtst() throws InterruptedException
	{
		Dashboardpge ob = new Dashboardpge(driver);
		//ob.slctusr("Geethu");
		//ob.dshbrd();
		//ob.addnote();
		//ob.addtask("tst","tstdesc");
		ob.addissue("issuetst","issuedesc");
	}


}
