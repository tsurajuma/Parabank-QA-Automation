package com.umasuraj.automation.framework;

import org.openqa.selenium.WebDriver;

import com.umasuraj.automation.framework.driver.DriverSingleton;
import com.umasuraj.automation.framework.utility.FrameworkProperties;
import com.umasuraj.automation.parabank.pages.AccountOverviewPage;
import com.umasuraj.automation.parabank.pages.IndexPage;
import com.umasuraj.automation.parabank.pages.RegisterPage;

/**
 *
 * @author umasuraj
 */

public class Parabank {

	public static void main(String[] args) {
		FrameworkProperties frameworkProperties = new FrameworkProperties();
		String driverName = frameworkProperties.getProperty("browser-name");
		DriverSingleton driverInstance = DriverSingleton.getInstance(driverName);
		WebDriver driver = driverInstance.getDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		IndexPage indexPage = new IndexPage();
		indexPage.clickRegisterLink();
		
		RegisterPage registerPage = new RegisterPage();
		registerPage.reglster();
		
		AccountOverviewPage accountOverviewPage = new AccountOverviewPage();
		
		accountOverviewPage.accountActivity();
		accountOverviewPage.openNewAccount();
		accountOverviewPage.transferFunds();
		accountOverviewPage.billPay();
		accountOverviewPage.findTransactions();
		accountOverviewPage.updateContactInfo();
		accountOverviewPage.requestLoan();
		// accountOverviewPage.logout();
	}

}
