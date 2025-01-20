package org.tcs.testing.siginup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}
	@FindBy(name="first_name")
	private WebElement name;

	@FindBy(name="last_name")
	private WebElement lastname;

	@FindBy(name="address")
	private WebElement add;

	@FindBy(name="cc_num")
	private WebElement cardnum;

	@FindBy(name="cc_type")
	private WebElement cctype;

	@FindBy(name="cc_exp_month")
	private WebElement expmonth;

	@FindBy(name="cc_cvv")
	private WebElement cvv;

	@FindBy(name="cc_exp_year")
	private WebElement expyear;

	@FindBy(name="book_now")
	private WebElement bookbtn;

	public void BookHotel(String fname,String lname,String add, String number,String type,String month,String year,String cvv) {
		inserttext(getName(), fname);
		inserttext(getLastname(), lname);
		inserttext(getAdd(), add);
		inserttext(getCardnum(), number);
		SelectByVisibletext(getCctype(), type);
		SelectByVisibleText(getExpmonth(), month);
		SelectByVisibleText(getExpyear(), year);
		inserttext(getCvv(), cvv);
		BtnClick(getBookbtn());
	}

}
