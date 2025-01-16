package org.tcs.testing.siginup;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver LaunchingBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		return driver;
		 
	    
	}
	
	public void LoadUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void inserttext(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public void BtnClick(WebElement element) {
		element.click();

	}
	
	 public void Moveto(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	 
	 public void DragandDrop(WebElement source,WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public void Scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoview[true]");

	}
	
	public void SelectByVisibletext(WebElement element , String text) {
			Select s = new Select(element);
            s.selectByVisibleText(text);
	}
	
	public void Quitbrowser() {
		driver.close();

	}
	
	public void SelectByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public void ClearTex(WebElement element) {
		element.clear();

	}
	
	
	
	
	
	
}