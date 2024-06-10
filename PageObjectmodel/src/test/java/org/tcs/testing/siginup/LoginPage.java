package org.tcs.testing.siginup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(name="username")
		private WebElement First;
		
		@FindBy(name="password")
		private WebElement Password;
		
		@FindBy(name="login")
		private WebElement btnsubmit;
		
		public WebElement getFirst() {
			return First;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}
		
		
		public void LoginpageElements(String firstname,String pass) {
			inserttext(getFirst(),firstname);
			inserttext(getPassword(), pass);
			BtnClick(getBtnsubmit());

		}
		
		
		
		
		
		
		
		
	
	
	

}
