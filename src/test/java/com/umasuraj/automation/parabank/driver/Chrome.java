package com.umasuraj.automation.parabank.driver;

import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.umasuraj.automation.framework.driver.strategy.DriverStrategy;
import com.umasuraj.automation.framework.utility.Constants;
import com.umasuraj.automation.framework.utility.FrameworkProperties;

/**
 *
 * @author umasuraj
 */

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		
		FrameworkProperties frameworkProperties = new FrameworkProperties();
		String chromeVersion = frameworkProperties.getProperty("chrome-version");

		String driverLocation = Constants.DRIVER_LOCATION + Constants.CHROME + "/" + chromeVersion + "/" +  Constants.CHROME_DRIVER;
		
		File driverFile = new File(driverLocation);
		
		if(!driverFile.exists()) {
			System.err.println("Chrome Driver Version: " + chromeVersion + " : " + Constants.FILE_NOT_FOUND_EXCEPTION_MESSAGE);
		}	
		
		System.setProperty("webdriver.chrome.driver", driverLocation);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(options);

		return driver;
	}

}
