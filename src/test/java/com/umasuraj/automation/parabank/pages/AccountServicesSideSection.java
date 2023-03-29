package com.umasuraj.automation.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.umasuraj.automation.framework.driver.DriverSingleton;
import com.umasuraj.automation.framework.utility.Constants;

import lombok.Getter;
import lombok.Setter;

public class AccountServicesSideSection {

	private WebDriver driver;

	public AccountServicesSideSection() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	// end constructor() method

	// -----------------------------------------------------------------

	// --- WebElements in Side Section - Account Services ---

	@FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[1]/a")
	private WebElement openNewAccountLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(2) > a")
	private WebElement accountOverviewLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(3) > a")
	private WebElement transferFundsLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(4) > a")
	private WebElement billPayLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(5) > a")
	private WebElement findTransactionsLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(5) > a")
	private WebElement updateContactInfoLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(7) > a")
	private WebElement requestLoanLink;

	@FindBy(css = "#leftPanel > ul > li:nth-child(8) > a")
	private WebElement logoutLink;

	public WebDriver getDriver() {
		return driver;
	}

	// -------------------------------------------------------------------

	public void openNewAccount() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(openNewAccountLink));
		openNewAccountLink.click();
	}

	public void accountOverview() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(accountOverviewLink));
		accountOverviewLink.click();
	}

	public void transferFunds() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(transferFundsLink));
		transferFundsLink.click();
	}

	public void billPay() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(billPayLink));
		billPayLink.click();
	}

	public void findTransactions() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(findTransactionsLink));
		findTransactionsLink.click();
	}

	public void updateContactInfo() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(updateContactInfoLink));
		updateContactInfoLink.click();
	}

	public void requestLoan() {
		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
		// wait.until(ExpectedConditions.visibilityOf(requestLoanLink));
		requestLoanLink.click();
	}

//	public void logout() {
//		// WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
//		// wait.until(ExpectedConditions.visibilityOf(logoutLink));
//		logoutLink.click();
//	}

}
