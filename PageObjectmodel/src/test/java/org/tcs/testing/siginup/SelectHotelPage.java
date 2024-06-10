package org.tcs.testing.siginup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	@FindBy(name="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(name="continue")
	private WebElement continuebtn;
	
	public void SelectHotel() {
		BtnClick(getRadiobtn());
		BtnClick(getContinuebtn());

	}
	
	

}
