package com.umasuraj.automation.parabank.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.umasuraj.automation.framework.driver.strategy.DriverStrategy;
import com.umasuraj.automation.framework.utility.Constants;

/**
 *
 * @author umasuraj
 */

public class PhantomJs implements DriverStrategy {

	public WebDriver setStrategy() {

		String driverLocation = Constants.DRIVER_LOCATION + Constants.PHANTOMJS + "/" + Constants.PHANTOMJS__DRIVER;

		File driverFile = new File(driverLocation);

		if (!driverFile.exists()) {
			System.err.println("PhantomJS Driver: " + Constants.FILE_NOT_FOUND_EXCEPTION_MESSAGE);
		}

		System.setProperty("phantomjs.binary.path", driverLocation);
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setJavascriptEnabled(true);

		WebDriver driver = new PhantomJSDriver(desiredCapabilities);

		return driver;
	}

}
