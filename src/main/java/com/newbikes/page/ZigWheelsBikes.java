package com.newbikes.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.newbikes.base.BaseUI;

public class ZigWheelsBikes extends BaseUI {

	public ZigWheelsBikes(WebDriver driver, WebElement element) {
		super(driver, element);
	}
	static By close          = By.id("alternate-login-close");
	static By bikes          = By.xpath("//*[@id='headerNewNavWrap']/div[2]/ul/li[3]/a");
	static By upcomming      = By.xpath("//*[@id='headerNewNavWrap']/div[2]/ul/li[3]/ul/li[4]/a");
	static By model          = By.id("makeId");
	static By cal            = By.xpath("//span[@class='zw-cmn-loadMore']");
	static By bikeNames      = By.xpath("//a[@data-track-label='model-name']");
	static By bikeLaunchDate = By.xpath("//div[@class='clr-try fnt-14']");
    static By bikePrices     = By.xpath("//div[@class='b fnt-15']");
  
    public static List<WebElement> bikeNames(){
	   List<WebElement> x = driver.findElements(bikeNames);
	   return x;
   } 
   public static List<WebElement> bikeLaunchDate(){
	   List<WebElement> y = driver.findElements(bikeLaunchDate);
	   return y;
   } 
   public static List<WebElement> bikePrices(){
	   List<WebElement> z = driver.findElements(bikePrices);
	   return z;
   } 
    
    
    public static WebElement Close() {
        element=driver.findElement(close);
        return element;
    }

	public static WebElement Bikes() {
        element=driver.findElement(bikes);
        return element;
    }

	public static WebElement Upcomming() {
        element=driver.findElement(upcomming);
        return element;
    }

	public static WebElement Model() {
        element=driver.findElement(model);
        return element;
    }

	public static WebElement Cal() {
        element=driver.findElement(cal);
        return element;
    }
	
}
