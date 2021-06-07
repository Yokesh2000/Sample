package com.newbikes.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BaseUI { 
	public static WebDriver driver;
	public static WebElement element;
		public BaseUI(WebDriver driver,WebElement element) {
			BaseUI.driver=driver;
			BaseUI.element= element; 
			}
	
}