package Test;

import org.testng.annotations.Test;

import Page.Users;

public class Userstst extends Baseclass {
@Test
public void tstusr() throws InterruptedException
{
	Users u = new Users(driver);
	
	//u.usr("testautom","automate users field");
	//u.edit();
	//u.inviteagin();
	//u.search("vishnu");
	//u.addnewusr("tstaut", "usr", "wsp84703@zbock.com");
//	u.shwn();
	//u.enabledisable();
	u.inactive();

	
}

}
