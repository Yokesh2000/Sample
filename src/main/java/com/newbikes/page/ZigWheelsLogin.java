package com.newbikes.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.newbikes.base.BaseUI;

public class ZigWheelsLogin extends BaseUI{

	public ZigWheelsLogin(WebDriver driver, WebElement element) {
		super(driver, element);
	}
	  
	static By login          = By.id("forum_login_title_lg");
	static By sign           = By.xpath("//div[@class='lgn-sc c-p txt-l pl-30 pr-30' and @id='googleSignIn']");
	static By mail           = By.id("identifierId");
	static By next           = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]");
	static By mistake        = By.xpath("//div[@class='DRS7Fe bxPAYd k6Zj8d' and @role='presentation']"); 
	

	public static WebElement Login() {
        element=driver.findElement(login);
        return element;
    }
	public static WebElement Sign() {
        element=driver.findElement(sign);
        return element;
    }
	public static WebElement Mail() {
        element=driver.findElement(mail);
        return element;
    }
	public static WebElement Next() {
        element=driver.findElement(next);
        return element;
    }
	public static WebElement Mistake() {
        element=driver.findElement(mistake);
        return element;
    } 
}
