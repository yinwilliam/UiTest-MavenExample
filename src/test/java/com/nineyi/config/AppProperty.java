package com.nineyi.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppProperty {
	
	public static Properties appProp = new Properties();
	static{
		loadProp();
	}
	public static void loadProp(){
		try {
			appProp.load(new FileInputStream("src/test/resources/application.properties"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
