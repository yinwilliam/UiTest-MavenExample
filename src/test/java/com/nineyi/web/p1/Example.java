package com.nineyi.web.p1;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nineyi.config.AppProperty;
import com.nineyi.config.BasicConfig;

public class Example {
	static String baseUrl;
	static WebDriver driver;
	public static Properties appProp = AppProperty.appProp;
	
	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", BasicConfig.CHROMEDRIVER_PATH + "chromedriver");
		driver = new ChromeDriver();
		baseUrl = appProp.getProperty("site.url");
	}
	
	@Test
	public void testT843() throws Exception {
		try {
			driver.get(baseUrl);
			driver.findElement(By.id("lst-ib")).sendKeys("91app");
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			
		} 
		catch (Exception ex) {
			throw ex;
		} 
		finally {
		}
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
