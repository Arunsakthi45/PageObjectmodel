package org.tce.login.test;


import org.openqa.selenium.WebDriver;
import org.tcs.testing.siginup.BaseClass;
import org.tcs.testing.siginup.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends LoginPage{
	
	
	 @BeforeMethod
	private void Launch() {
		BaseClass b = new BaseClass();
		WebDriver driver = b.LaunchingBrowser();
		b.LoadUrl("https://adactinhotelapp.com/");

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
	
	@AfterMethod
	   private void qiut() {
		   BaseClass b = new BaseClass();
		   b.Quitbrowser();
	}

	

}
