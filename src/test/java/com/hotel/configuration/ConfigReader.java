package com.hotel.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public Properties prop;

	public ConfigReader() throws Throwable  {
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Hotel\\src\\test\\java\\com\\hotel\\configuration\\Configuration.property");
		FileInputStream fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}
	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = prop.getProperty("url");
		return url;
	}
	public String getCredit_Card_Number() {
		String cCardNumber = prop.getProperty("credit_card_number");
		return cCardNumber;

	}
	public String getCVV() {
		String cvv = prop.getProperty("cvv");
		return cvv;
	}

}
