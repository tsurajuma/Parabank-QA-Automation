package com.umasuraj.automation.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.umasuraj.automation.framework.driver.DriverSingleton;
import com.umasuraj.automation.framework.utility.Constants;

/**
 *
 * @author umasuraj
 */

public class IndexPage {

	private WebDriver driver;
	
	public IndexPage( ) {		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	// end constructor() method
	
	@FindBy(css = "#loginPanel > form > div:nth-child(2) > input")
	private WebElement loginUsernameField;
	
	@FindBy(css = "#loginPanel > form > div:nth-child(4) > input")
	private WebElement loginPasswordField;
	
	@FindBy(css = "#loginPanel > form > div:nth-child(5) > input")
	private WebElement loginButton;	
	
	@FindBy(css = "#loginPanel > p:nth-child(3) > a")
	private WebElement forgetLoginInfoLink;	
	
	@FindBy(css = "#loginPanel > p:nth-child(3) > a")
	private WebElement registerLink;
	
	public void login(String username, String password) {
		
	//	WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
	//	wait.until(ExpectedConditions.visibilityOf(loginUsernameField));
	//	wait.until(ExpectedConditions.visibilityOf(loginPasswordField));
	//	wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		
		loginUsernameField.sendKeys(username);
		loginPasswordField.sendKeys(password);
		loginButton.click();
	}
	
	public void clickForgetLoginInfoLink() {
		forgetLoginInfoLink.click();
	}
	
	public void clickRegisterLink() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(registerLink));
		registerLink.click();
	}
	
	
	
}
// end class IndexPage{}
