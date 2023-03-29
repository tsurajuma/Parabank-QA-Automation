package com.umasuraj.automation.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.umasuraj.automation.framework.driver.DriverSingleton;
import com.umasuraj.automation.framework.utility.Constants;

public class AccountOverviewPage {
// 123

	private WebDriver driver;

	private AccountServicesSideSection accountServicesSideSection = new AccountServicesSideSection();

	private String pageTitle;

	public AccountOverviewPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	// end constructor() method

	// --------------------------------------------------------------------------

	// --- WebElements in Side Section - Account Services ---
	// getting elements from AccountServicesSideSection class

//	private WebElement openNewAccountLink = accountServicesSideSection.getOpenNewAccountLink();
//
//	private WebElement accountOverviewLink = accountServicesSideSection.getAccountOverviewLink();
//
//	private WebElement transferFundsLink = accountServicesSideSection.getTransferFundsLink();
//
//	private WebElement billPayLink = accountServicesSideSection.getBillPayLink();
//
//	private WebElement findTransactionsLink = accountServicesSideSection.getFindTransactionsLink();
//
//	private WebElement updateContactInfoLink = accountServicesSideSection.getUpdateContactInfoLink();
//
//	private WebElement requestLoanLink = accountServicesSideSection.getRequestLoanLink();
//
//	private WebElement logoutLink = accountServicesSideSection.getLogoutLink();

	// ----------------------------------------------------------------------------

	// --- WebElements Main Section - Accounts Overview ---

	@FindBy(css = "#leftPanel > ul > li:nth-child(8) > a")
	private WebElement accountNumberActivityLink;

	// -------------------------------------------------------------------

	// --- General Actions ---

	public String getPageTitle() {
		return driver.getTitle();
	}

	// --- Actions on WebElements ---

	public void accountActivity() {
		accountNumberActivityLink.click();
	}

	public void openNewAccount() {		
		accountServicesSideSection.openNewAccount();
	}

	public void accountOverview() {
		accountServicesSideSection.accountOverview();
	}

	public void transferFunds() {
		accountServicesSideSection.transferFunds();
	}

	public void billPay() {
		accountServicesSideSection.billPay();
	}

	public void findTransactions() {
		accountServicesSideSection.findTransactions();
	}

	public void updateContactInfo() {
		accountServicesSideSection.updateContactInfo();
	}

	public void requestLoan() {
		accountServicesSideSection.requestLoan();
	}

//	public void logout() {
//		accountServicesSideSection.logout();
//	}

}
// end class 