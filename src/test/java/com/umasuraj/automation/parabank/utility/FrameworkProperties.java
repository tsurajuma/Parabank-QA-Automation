package com.umasuraj.automation.framework.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author umasuraj
 */

public class FrameworkProperties {

	private String propertyValue = "";
	private InputStream inputStream;

	public String getProperty(String propertyKey) {

		try {
			Properties properties = new Properties();
			String propertyFileName = Constants.PROPERTIES_FILE_NAME;
			inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);

			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("Framework Properties: " + Constants.FILE_NOT_FOUND_EXCEPTION_MESSAGE);
			}

			String propertyValue = properties.getProperty(propertyKey);
			this.propertyValue = propertyValue;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return propertyValue;
	}
	// end getProperty() method

}
//end class FrameworkProperties{}
