package com.newbikes.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.newbikes.base.BaseUI;

public class DriverSetUp extends BaseUI{  
	
    public DriverSetUp(WebDriver driver, WebElement element) {
		super(driver, element);
	}
	public static void  Initiate(int i) throws IOException {
		switch(i)
		{
		case 1:
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
			  ChromeOptions opt = new ChromeOptions();
			  opt.addArguments("--disable-notifications");
			  driver=new ChromeDriver(opt);
			  driver.manage().window().maximize(); 
			  driver.get(propertyFile("baseUrl"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  break;
	   case 2:
			  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			  FirefoxOptions opt1 = new FirefoxOptions();
			  opt1.addPreference("dom.webnotifications.enabled",false);
			  driver = new FirefoxDriver(opt1);
			  driver.manage().window().maximize();
			  driver.get(propertyFile("baseUrl"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  break;
		}
		}  
	public static String  propertyFile(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		prop.load(fs);
		return prop.getProperty(key);
	}
	public static void CloseDriver(){
		   driver.quit();
	  }
}

