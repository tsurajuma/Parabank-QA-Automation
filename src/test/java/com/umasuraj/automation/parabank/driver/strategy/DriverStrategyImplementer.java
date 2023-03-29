package com.umasuraj.automation.framework.driver.strategy;

import com.umasuraj.automation.parabank.driver.Chrome;
import com.umasuraj.automation.parabank.driver.Firefox;
import com.umasuraj.automation.parabank.driver.PhantomJs;
import com.umasuraj.automation.framework.utility.Constants;

/**
 *
 * @author umasuraj
 */

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {

		switch (strategy) {

		case Constants.CHROME:
			return new Chrome();

		case Constants.FIREFOX:
			return new Firefox();

		case Constants.PHANTOMJS:
			return new PhantomJs();

		default:
			return null;
		}

	}
	// end chooseStrategy() method

}
// end class DriverStrategyImplementer{}
