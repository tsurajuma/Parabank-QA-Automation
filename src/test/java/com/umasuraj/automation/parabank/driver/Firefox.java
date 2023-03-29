package com.umasuraj.automation.parabank.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.umasuraj.automation.framework.driver.strategy.DriverStrategy;
import com.umasuraj.automation.framework.utility.Constants;

/**
 *
 * @author umasuraj
 */

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		String driverLocation = Constants.DRIVER_LOCATION + Constants.FIREFOX + "/" + Constants.FIREFOX_DRIVER;

		File driverFile = new File(driverLocation);

		if (!driverFile.exists()) {
			System.err.println("Firefox Driver: " + Constants.FILE_NOT_FOUND_EXCEPTION_MESSAGE);
		}

		System.setProperty("webdriver.gecko.driver", driverLocation);

		FirefoxProfile profile = new FirefoxProfile();
		FirefoxOptions options = new FirefoxOptions();
		
		options.setProfile(profile);
		options.setLegacy(true);
		options.setCapability("marionette",true);
		options.addPreference("browser.startup.page", 1);
		options.addPreference("browser.startup.homepage", "https://www.google.co.uk");
		options.setAcceptInsecureCerts(true);
		options.setHeadless(false);

		WebDriver driver = new FirefoxDriver(options);		

		return driver;
	}

}
