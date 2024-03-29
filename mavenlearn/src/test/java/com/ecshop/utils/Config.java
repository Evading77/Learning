package com.ecshop.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private Properties prop;
	public Config(String filename) {
		prop=new Properties();
		InputStream is=this.getClass().getClassLoader().getResourceAsStream(filename);
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getConfig(String key) {
		return prop.getProperty(key);
	}
}
