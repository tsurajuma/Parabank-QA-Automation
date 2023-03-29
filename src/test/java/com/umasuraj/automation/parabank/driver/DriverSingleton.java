package com.umasuraj.automation.framework.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.umasuraj.automation.framework.driver.strategy.DriverStrategy;
import com.umasuraj.automation.framework.driver.strategy.DriverStrategyImplementer;

/**
 *
 * @author umasuraj
 */

public class DriverSingleton {

	private static DriverSingleton driverSingleton = null;
	private static WebDriver driver;

	private DriverSingleton(String driverName) {
		instantiate(driverName);
	}

	public WebDriver instantiate(String strategy) {

		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}
	// end instantiate() method

	public static DriverSingleton getInstance(String driverName) {

		if (driverSingleton == null) {
			driverSingleton = new DriverSingleton(driverName);
		}

		return driverSingleton;

	}
	// end getInstance() method

	public static void closeObjectInstance() {
		driverSingleton = null;
		driver.quit();
	}
	// end closeObjectInstance() method

	public static WebDriver getDriver() {

		return driver;
	}
	// end getDriver() method

}
// end class DriverSingleton{}
