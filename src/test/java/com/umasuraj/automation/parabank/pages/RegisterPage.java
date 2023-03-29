package com.umasuraj.automation.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.umasuraj.automation.framework.driver.DriverSingleton;
import com.umasuraj.automation.framework.utility.Constants;
import com.umasuraj.automation.framework.utility.RandomString;

public class RegisterPage {

private WebDriver driver;
	
	public RegisterPage( ) {		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	// end constructor() method
	
	@FindBy(css = "#customer\\.firstName")
	private WebElement firstNameField;
	
	@FindBy(css = "#customer\\.lastName")
	private WebElement lastNameField;
	
	@FindBy(css = "#customer\\.address\\.street")
	private WebElement addressField;
	
	@FindBy(css = "#customer\\.address\\.city")
	private WebElement cityField;
	
	@FindBy(css = "#customer\\.address\\.state")
	private WebElement stateField;
	
	@FindBy(css = "#customer\\.address\\.zipCode")
	private WebElement zipCodeField;
	
	@FindBy(css = "#customer\\.phoneNumber")
	private WebElement phoneField;
	
	@FindBy(css = "#customer\\.ssn")
	private WebElement ssnField;
	
	@FindBy(css = "#customer\\.username")
	private WebElement usernameField;
	
	@FindBy(css = "#customer\\.password")
	private WebElement passwordField;
	
	@FindBy(css = "#repeatedPassword")
	private WebElement confirmPasswordField;
	
	@FindBy(css = "#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")
	private WebElement registerButton;
	
	public void reglster() {
		
		WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(firstNameField));
		
		firstNameField.sendKeys("Raghavendra");
		lastNameField.sendKeys("Reddy");
		addressField.sendKeys("Ananthapur");
		cityField.sendKeys("Ananthapur District");
		stateField.sendKeys("Andhra Pradesh");
		zipCodeField.sendKeys("635118");
		phoneField.sendKeys("9943955287");
		ssnField.sendKeys("1234");
		
		
		String username = new RandomString().generateRandomString().toLowerCase();
		System.out.println("Random username is: " + username);
		
		usernameField.sendKeys(username);
		passwordField.sendKeys("123");
		confirmPasswordField.sendKeys("123");
		
		
		registerButton.click();
	}
	
}
