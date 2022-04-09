package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import PomPages.Amazonsignin;
import PomPages.Homepage;
import PomPages.LoginPage;
import PomPages.MenShoesPage;

public class testcase1 extends BaseClass{

	@Test
	public void tc1() throws IOException {
		LoginPage lp = new LoginPage(driver);
		driverutilities.mousehover(driver, lp.getSignintab());
		lp.signbtn();
		
		Amazonsignin am = new Amazonsignin(driver);
		am.usertab(pdata.getPropertyData("user"));
		am.continuebutton();
		am.passwordtab(pdata.getPropertyData("password"));
		am.siginbutton();
		
		Homepage hp = new Homepage(driver);
		hp.searchbox(pdata.getPropertyData("name"));
		hp.searchbtn();
		
		MenShoesPage ms = new MenShoesPage(driver);
		ms.allbtn();
		ms.signoutbtn();
	}
	
	
}
