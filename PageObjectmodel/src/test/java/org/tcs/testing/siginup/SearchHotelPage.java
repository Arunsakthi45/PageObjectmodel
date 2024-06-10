package org.tcs.testing.siginup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}

	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement room;
	
	@FindBy(name="room_nos")
	private WebElement roomnumber;
	
	@FindBy(name="datepick_in")
	private WebElement datein;
	
	@FindBy(name="datepick_out")
	private WebElement dateout;
	
	@FindBy(name="adult_room")
	private WebElement adults;
	
	@FindBy(name="child_room")
	private WebElement childrens;
	
	@FindBy(name="Submit")
	private WebElement Submitbtn;
	
	public void Searchhotel(String loc,String hotel,String rom,String number,String date,String dateot,String adult,String child) {
		SelectByVisibleText(getLocation(),loc);
		SelectByVisibleText(getHotels(), hotel);
		SelectByVisibleText(getRoom(),rom);
		SelectByVisibleText(getRoomnumber(),number);
		ClearTex(getDatein());
		inserttext(getDatein(),date);
		ClearTex(getDateout());
		inserttext(getDateout(),dateot);
		SelectByVisibleText(getAdults(),adult);
		SelectByVisibleText(getChildrens(),child);
		BtnClick(getSubmitbtn());

	}
	
	
	

}
