package org.tce.login.test;
import org.tcs.testing.siginup.BaseClass;
import org.tcs.testing.siginup.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends LoginPage{


	@BeforeMethod
	@Parameters({"url"})
	private void Launch(@Optional("https://adactinhotelapp.com/")String url) {
		BaseClass b = new BaseClass();
		b.LaunchingBrowser();
		b.LoadUrl(url);
	}


	@Parameters({"name1","pass"})
	@Test
	private void Tc1(@Optional("Arunkumar456")String names,@Optional("FI178Q")String pass) {
		LoginPage l = new LoginPage();
		l.LoginpageElements(names,pass );
	}

	@Parameters({"name1","pass"})
	@Test
	private void Tc2(@Optional("Arunkumar45")String names,@Optional("FI178Q")String pass) {
		LoginPage l = new LoginPage();
		l.LoginpageElements(names,pass );
	}

	@Test
	private void Tc3() {
		LoginPage l = new LoginPage();
		l.getBtnsubmit().click();
		String text2 = l.getText().getText();		
		String text1 = "Enter Username";
		if (text2.equalsIgnoreCase(text1)) {
			System.out.println(text2);
		}

	}

	@AfterMethod
	private void qiut() {
		BaseClass b = new BaseClass();
		b.Quitbrowser();
	}



}
