package com.nineyi.config;

public class BasicConfig {
	private static String userDir = System.getProperty("user.home");
	private static String sysSeparator = System.getProperty("file.separator");
	public static String REPORT_PATH = userDir + sysSeparator + "Documents" + sysSeparator + "extentx" + sysSeparator ;
	public static String CHROMEDRIVER_PATH = userDir + sysSeparator + "Documents" + sysSeparator + "selenium" + sysSeparator;
	public static String EXTENTCONFIG_PATH = "src/test/resources/extent-config.xml";
	public static String ClearCookies = userDir + sysSeparator + "Documents" + sysSeparator + "clearcookies.sh";
	public static String NineYiApp = userDir+ sysSeparator + "xxx.ipa";
}
