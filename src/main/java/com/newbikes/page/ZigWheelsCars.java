package com.newbikes.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.newbikes.base.BaseUI;

public class ZigWheelsCars extends BaseUI{

	public ZigWheelsCars(WebDriver driver, WebElement element) {
		super(driver, element);
	} 
	
	static By used		     = By.xpath("//header/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/a[1]");
	static By city		     = By.xpath("//a[contains(text(),'Chennai')]");
	static By carNames       = By.xpath("//input[@name='bycarid' and @type='checkbox']");
	
	
	public static WebElement Used() {
        element=driver.findElement(used);
        return element;
    }
	public static WebElement City() {
        element=driver.findElement(city);
        return element;
    } 
	 public static List<WebElement> carNames(){
	    	List<WebElement> web = driver.findElements(carNames);
	    	return web;
	 }
	
	
	
}
