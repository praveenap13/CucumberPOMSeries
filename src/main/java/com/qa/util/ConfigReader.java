package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	/**
	 * This method is used to load properties from config file and return properties object 
	 */

	private Properties prop;
	
	//encapsulation
	public Properties init_prop()  {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./src/test/resources/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
