package org.tcs.testing.siginup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainClass {
	
	
	@BeforeClass
		private void Launch() {
			BaseClass b = new BaseClass();
			WebDriver driver = b.LaunchingBrowser();
			b.LoadUrl("https://adactinhotelapp.com/");

		}
		
	@Parameters({"name1","pass"})
		@Test
		private void Tc1(@Optional("Arunkumar45")String names,@Optional("FI178Q")String pass) {
			LoginPage l = new LoginPage();
			l.LoginpageElements(names,pass );
		}
		
		@Test
		private void Tc2() {
			SearchHotelPage s = new SearchHotelPage();
			s.Searchhotel("London","Hotel Sunshine","Super Deluxe","5 - Five","08-05-2024","15-05-2024","4 - Four","3 - Three");
			
		}
		
		@Test
		private void Tc3() {
			SelectHotelPage h = new SelectHotelPage();
			h.SelectHotel();
			
		}
		
		@Test
		private void Tc4() {
			BookHotelPage bk =new BookHotelPage();
			bk.BookHotel("arun", "sakthi","29,pollachi","1234567891023456" ,"American Express", "February", "2026", "001");
		}
		
	
	@AfterClass 
	   private void qiut() {
		   BaseClass b = new BaseClass();
		   b.Quitbrowser();
	}


}
